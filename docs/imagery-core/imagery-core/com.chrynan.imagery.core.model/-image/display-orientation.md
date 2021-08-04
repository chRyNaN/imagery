//[imagery-core](../../../index.md)/[com.chrynan.imagery.core.model](../index.md)/[Image](index.md)/[displayOrientation](display-orientation.md)

# displayOrientation

[common]\
val [displayOrientation](display-orientation.md): [ImageOrientation](../-image-orientation/index.md)?

The [ImageOrientation](../-image-orientation/index.md) calculated from the dimensions of this [Image](index.md).

Note that this is different from the [orientation](orientation.md) property. The [orientation](orientation.md) property refers to the [ImageOrientation](../-image-orientation/index.md) when the [Image](index.md) was taken, this refers to the [ImageOrientation](../-image-orientation/index.md) when the [Image](index.md) is displayed. These can be the same or different values. For instance, an [Image](index.md) that was taken in portrait mode might have pixels added to the sides of the [Image](index.md) so that the width equals the height. In this case, the [displayOrientation](display-orientation.md) property would return [ImageOrientation.SQUARE](../-image-orientation/-s-q-u-a-r-e/index.md) but the [orientation](orientation.md) property would return [ImageOrientation.PORTRAIT](../-image-orientation/-p-o-r-t-r-a-i-t/index.md).

#### Return

null if the [size](size.md) property is null, [ImageOrientation.LANDSCAPE](../-image-orientation/-l-a-n-d-s-c-a-p-e/index.md) if the [size](size.md) width is greater than the [size](size.md) height, [ImageOrientation.PORTRAIT](../-image-orientation/-p-o-r-t-r-a-i-t/index.md) if the [size](size.md) width is less than the [size](size.md) height, [ImageOrientation.SQUARE](../-image-orientation/-s-q-u-a-r-e/index.md) if the [size](size.md) width equals the [size](size.md) height, [ImageOrientation.UNDEFINED](../-image-orientation/-u-n-d-e-f-i-n-e-d/index.md) otherwise.
