package com.chrynan.imagery.core

import com.chrynan.imagery.core.model.FocalPoint

/**
 * Calculates the image matrix needed to maintain the correct cropping for image views based on
 * their focal point.
 *
 * The purpose of this class is to make sure that the focal point information on media
 * attachments are honoured. This class uses the custom matrix option of android ImageView's to
 * customize how the image is cropped into the view.
 *
 * @see [The explanation of focal points](https://github.com/jonom/jquery-focuspoint#1-calculate-your-images-focus-point)
 * @see [This was extracted and adapted from the Tusky App Source Code](https://github.com/tuskyapp/Tusky)
 */
internal class BaseFocalPointResolver : FocalPointResolver {

    /**
     * Update the given matrix for the given parameters.
     *
     * How it works is using the following steps:
     *   - First we determine if the image is too wide or too tall for the view size. If it is
     *   too wide, we need to crop it horizontally and scale the height to fit the view
     *   exactly. If it is too tall we need to crop vertically and scale the width to fit the
     *   view exactly.
     *   - Then we determine what translation is needed to get the focal point in view. We
     *   prefer to get the focal point at the center of the preview. However if that would
     *   result in some part of the preview being empty, we instead align the image so that it
     *   fills the view, but still the focal point is always in view.
     *
     * @param viewWidth The width of the imageView.
     * @param viewHeight The height of the imageView
     * @param imageWidth The width of the actual image
     * @param imageHeight The height of the actual image
     * @param focalPoint The focal point to focus
     *
     * @return The [FocalPointResolver.Result] instance used to calculate the matrix representing
     * the portion of the image to be displayed.
     */
    override suspend fun resolve(
        viewWidth: Float,
        viewHeight: Float,
        imageWidth: Float,
        imageHeight: Float,
        focalPoint: FocalPoint
    ): FocalPointResolver.Result {
        val scale = calculateScaling(viewWidth, viewHeight, imageWidth, imageHeight)

        var top = 0f
        var left = 0f
        if (isVerticalCrop(viewWidth, viewHeight, imageWidth, imageHeight)) {
            top = focalOffset(viewHeight, imageHeight, scale, focalPoint.viewY)
        } else { // horizontal crop
            left = focalOffset(viewWidth, imageWidth, scale, focalPoint.viewX)
        }

        return FocalPointResolver.Result(
            scale = scale,
            dx = left,
            dy = top,
            imageWidth = imageWidth,
            imageHeight = imageHeight,
            viewWidth = viewWidth,
            viewHeight = viewHeight,
            focalPoint = focalPoint
        )
    }

    /**
     * Calculate the scaling of the image needed to make it fill the screen.
     *
     * The scaling used depends on if we need a vertical of horizontal crop.
     */
    private fun calculateScaling(
        viewWidth: Float,
        viewHeight: Float,
        imageWidth: Float,
        imageHeight: Float
    ): Float =
        if (isVerticalCrop(viewWidth, viewHeight, imageWidth, imageHeight)) {
            viewWidth / imageWidth
        } else {     // horizontal crop:
            viewHeight / imageHeight
        }

    /**
     * Return true if we need a vertical crop, false for a horizontal crop.
     */
    private fun isVerticalCrop(
        viewWidth: Float,
        viewHeight: Float,
        imageWidth: Float,
        imageHeight: Float
    ): Boolean {
        val viewRatio = viewWidth / viewHeight
        val imageRatio = imageWidth / imageHeight

        return viewRatio > imageRatio
    }

    /**
     * Calculate the relative offset needed to focus on the focal point in one direction.
     *
     * This method works for both the vertical and horizontal crops. It simply calculates
     * what offset to take based on the proportions between the scaled image and the view
     * available. It also makes sure to always fill the bounds of the view completely with
     * the image. So it won't put the very edge of the image in center, because that would
     * leave part of the view empty.
     */
    private fun focalOffset(
        view: Float,
        image: Float,
        scale: Float,
        focal: Float
    ): Float {
        // The fraction of the image that will be in view:
        val inView = view / (scale * image)
        var offset = 0f

        // These values indicate the maximum and minimum focal parameter possible while still
        // keeping the entire view filled with the image:
        val maxFocal = 1 - inView / 2
        val minFocal = inView / 2

        if (focal > maxFocal) {
            offset = -((2 - inView) / 2) * image * scale + view * 0.5f
        } else if (focal > minFocal) {
            offset = -focal * image * scale + view * 0.5f
        }

        return offset
    }
}
