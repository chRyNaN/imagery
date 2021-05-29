package com.chrynan.imagery.core

import androidx.exifinterface.media.ExifInterface
import com.chrynan.imagery.core.model.Metadata

/**
 * Android implementation of the [MetadataResolver] interface.
 *
 * Note that this only works with local image files.
 */
class AndroidMetadataResolver : MetadataResolver {

    @Suppress("BlockingMethodInNonBlockingContext")
    override suspend fun resolve(uri: String, mimeType: String?): Metadata? {
        val exif = ExifInterface(uri)

        return try {
            Metadata(
                aperture = exif.getAttribute(ExifInterface.TAG_APERTURE_VALUE)
                    ?.toFloatOrNull(),
                artist = exif.getAttribute(ExifInterface.TAG_ARTIST),
                bitsPerSample = exif.getAttribute(ExifInterface.TAG_BITS_PER_SAMPLE)?.toIntOrNull(),
                brightnessValue = exif.getAttribute(ExifInterface.TAG_BRIGHTNESS_VALUE)
                    ?.toFloatOrNull(),
                cfaPattern = exif.getAttribute(ExifInterface.TAG_CFA_PATTERN),
                colorSpace = exif.getAttribute(ExifInterface.TAG_COLOR_SPACE)?.toIntOrNull(),
                componentsConfiguration = exif.getAttribute(ExifInterface.TAG_COMPONENTS_CONFIGURATION),
                compressedBitsPerPixel = exif.getAttribute(ExifInterface.TAG_COMPRESSED_BITS_PER_PIXEL)
                    ?.toFloatOrNull(),
                compression = exif.getAttribute(ExifInterface.TAG_COMPRESSION)?.toIntOrNull(),
                contrast = exif.getAttribute(ExifInterface.TAG_CONTRAST)?.toIntOrNull(),
                copyright = exif.getAttribute(ExifInterface.TAG_COPYRIGHT),
                customRendered = exif.getAttribute(ExifInterface.TAG_CUSTOM_RENDERED)
                    ?.toIntOrNull(),
                datetime = exif.getAttribute(ExifInterface.TAG_DATETIME),
                datetimeDigitized = exif.getAttribute(ExifInterface.TAG_DATETIME_DIGITIZED),
                datetimeOriginal = exif.getAttribute(ExifInterface.TAG_DATETIME_ORIGINAL),
                defaultCropSize = exif.getAttribute(ExifInterface.TAG_DEFAULT_CROP_SIZE)
                    ?.toIntOrNull(),
                deviceSettingDescription = exif.getAttribute(ExifInterface.TAG_DEVICE_SETTING_DESCRIPTION),
                digitalZoomRatio = exif.getAttribute(ExifInterface.TAG_DIGITAL_ZOOM_RATIO)
                    ?.toDoubleOrNull(),
                dngVersion = exif.getAttribute(ExifInterface.TAG_DNG_VERSION)?.toIntOrNull(),
                exifVersion = exif.getAttribute(ExifInterface.TAG_EXIF_VERSION),
                exposureBiasValue = exif.getAttribute(ExifInterface.TAG_EXPOSURE_BIAS_VALUE)
                    ?.toDoubleOrNull(),
                exposureIndex = exif.getAttribute(ExifInterface.TAG_EXPOSURE_INDEX)
                    ?.toFloatOrNull(),
                exposureMode = exif.getAttribute(ExifInterface.TAG_EXPOSURE_MODE)?.toIntOrNull(),
                exposureProgram = exif.getAttribute(ExifInterface.TAG_EXPOSURE_PROGRAM)
                    ?.toIntOrNull(),
                exposureTime = exif.getAttribute(ExifInterface.TAG_EXPOSURE_TIME)?.toDoubleOrNull(),
                fileSource = exif.getAttribute(ExifInterface.TAG_FILE_SOURCE),
                flash = exif.getAttribute(ExifInterface.TAG_FLASH)?.toIntOrNull(),
                flashpixVersion = exif.getAttribute(ExifInterface.TAG_FLASHPIX_VERSION),
                flashEnergy = exif.getAttribute(ExifInterface.TAG_FLASH_ENERGY)?.toFloatOrNull(),
                focalLength = exif.getAttribute(ExifInterface.TAG_FOCAL_LENGTH)?.toFloatOrNull(),
                focalLengthIn35mmFilm = exif.getAttribute(ExifInterface.TAG_FOCAL_LENGTH_IN_35MM_FILM)
                    ?.toIntOrNull(),
                focalPlaneResolutionUnit = exif.getAttribute(ExifInterface.TAG_FOCAL_PLANE_RESOLUTION_UNIT)
                    ?.toIntOrNull(),
                focalPlaneXResolution = exif.getAttribute(ExifInterface.TAG_FOCAL_PLANE_X_RESOLUTION)
                    ?.toFloatOrNull(),
                focalPlaneYResolution = exif.getAttribute(ExifInterface.TAG_FOCAL_PLANE_Y_RESOLUTION)
                    ?.toFloatOrNull(),
                fNumber = exif.getAttribute(ExifInterface.TAG_F_NUMBER)?.toDoubleOrNull(),
                gainControl = exif.getAttribute(ExifInterface.TAG_GAIN_CONTROL)?.toIntOrNull(),
                gpsAltitude = exif.getAttribute(ExifInterface.TAG_GPS_ALTITUDE),
                gpsAreaInformation = exif.getAttribute(ExifInterface.TAG_GPS_AREA_INFORMATION),
                gpsDatestamp = exif.getAttribute(ExifInterface.TAG_GPS_DATESTAMP),
                gpsDestBearing = exif.getAttribute(ExifInterface.TAG_GPS_DEST_BEARING)
                    ?.toFloatOrNull(),
                gpsDestDistance = exif.getAttribute(ExifInterface.TAG_GPS_DEST_DISTANCE)
                    ?.toFloatOrNull(),
                gpsDestLatitude = exif.getAttribute(ExifInterface.TAG_GPS_DEST_LATITUDE)
                    ?.toFloatOrNull(),
                gpsDestLongitude = exif.getAttribute(ExifInterface.TAG_GPS_DEST_LONGITUDE)
                    ?.toFloatOrNull(),
                gpsDifferential = exif.getAttribute(ExifInterface.TAG_GPS_DIFFERENTIAL)
                    ?.toIntOrNull(),
                gpsDop = exif.getAttribute(ExifInterface.TAG_GPS_DOP)?.toFloatOrNull(),
                gpsImageDirection = exif.getAttribute(ExifInterface.TAG_GPS_IMG_DIRECTION)
                    ?.toFloatOrNull(),
                gpsLatitude = exif.getAttribute(ExifInterface.TAG_GPS_LATITUDE)?.toFloatOrNull(),
                gpsLongitude = exif.getAttribute(ExifInterface.TAG_GPS_LONGITUDE)?.toFloatOrNull(),
                gpsMapDatum = exif.getAttribute(ExifInterface.TAG_GPS_MAP_DATUM),
                gpsMeasureMode = exif.getAttribute(ExifInterface.TAG_GPS_MEASURE_MODE),
                gpsProcessingMethod = exif.getAttribute(ExifInterface.TAG_GPS_PROCESSING_METHOD),
                gpsSatellites = exif.getAttribute(ExifInterface.TAG_GPS_SATELLITES),
                gpsSpeed = exif.getAttribute(ExifInterface.TAG_GPS_SPEED)?.toFloatOrNull(),
                gpsStatus = exif.getAttribute(ExifInterface.TAG_GPS_STATUS),
                gpsTimestamp = exif.getAttribute(ExifInterface.TAG_GPS_TIMESTAMP),
                gpsTrack = exif.getAttribute(ExifInterface.TAG_GPS_TRACK)?.toFloatOrNull(),
                gpsVersionId = exif.getAttribute(ExifInterface.TAG_GPS_VERSION_ID),
                imageDescription = exif.getAttribute(ExifInterface.TAG_IMAGE_DESCRIPTION),
                imageLength = exif.getAttribute(ExifInterface.TAG_IMAGE_LENGTH)?.toIntOrNull(),
                imageUniqueId = exif.getAttribute(ExifInterface.TAG_IMAGE_UNIQUE_ID),
                imageWidth = exif.getAttribute(ExifInterface.TAG_IMAGE_WIDTH)?.toIntOrNull(),
                interoperabilityIndex = exif.getAttribute(ExifInterface.TAG_INTEROPERABILITY_INDEX)
                    ?.toIntOrNull(),
                jpegInterchangeFormat = exif.getAttribute(ExifInterface.TAG_JPEG_INTERCHANGE_FORMAT)
                    ?.toIntOrNull(),
                jpegInterchangeFormatLength = exif.getAttribute(ExifInterface.TAG_JPEG_INTERCHANGE_FORMAT_LENGTH)
                    ?.toIntOrNull(),
                lightSource = exif.getAttribute(ExifInterface.TAG_LIGHT_SOURCE)?.toIntOrNull(),
                make = exif.getAttribute(ExifInterface.TAG_MAKE),
                makerNote = exif.getAttribute(ExifInterface.TAG_MAKER_NOTE),
                maxApertureValue = exif.getAttribute(ExifInterface.TAG_MAX_APERTURE_VALUE)
                    ?.toFloatOrNull(),
                meteringMode = exif.getAttribute(ExifInterface.TAG_METERING_MODE)?.toIntOrNull(),
                model = exif.getAttribute(ExifInterface.TAG_MODEL),
                newSubfileType = exif.getAttribute(ExifInterface.TAG_NEW_SUBFILE_TYPE)
                    ?.toIntOrNull(),
                oecf = exif.getAttribute(ExifInterface.TAG_OECF),
                offsetTime = exif.getAttribute(ExifInterface.TAG_OFFSET_TIME),
                offsetTimeDigitized = exif.getAttribute(ExifInterface.TAG_OFFSET_TIME_DIGITIZED),
                offsetTimeOriginal = exif.getAttribute(ExifInterface.TAG_OFFSET_TIME_ORIGINAL),
                orfAspectFrame = exif.getAttribute(ExifInterface.TAG_ORF_ASPECT_FRAME)
                    ?.toIntOrNull(),
                orfPreviewImageLength = exif.getAttribute(ExifInterface.TAG_ORF_PREVIEW_IMAGE_LENGTH)
                    ?.toIntOrNull(),
                orfPreviewImageStart = exif.getAttribute(ExifInterface.TAG_ORF_PREVIEW_IMAGE_START)
                    ?.toIntOrNull(),
                orfThumbnailImage = exif.getAttribute(ExifInterface.TAG_ORF_THUMBNAIL_IMAGE),
                orientation = exif.getAttribute(ExifInterface.TAG_ORIENTATION)?.toIntOrNull(),
                photographicSensitivity = exif.getAttribute(ExifInterface.TAG_PHOTOGRAPHIC_SENSITIVITY)
                    ?.toIntOrNull(),
                photometricInterpretation = exif.getAttribute(ExifInterface.TAG_PHOTOMETRIC_INTERPRETATION)
                    ?.toIntOrNull(),
                pixelXDimension = exif.getAttribute(ExifInterface.TAG_PIXEL_X_DIMENSION)
                    ?.toIntOrNull(),
                pixelYDimension = exif.getAttribute(ExifInterface.TAG_PIXEL_Y_DIMENSION)
                    ?.toIntOrNull(),
                planarConfiguration = exif.getAttribute(ExifInterface.TAG_PLANAR_CONFIGURATION)
                    ?.toIntOrNull(),
                primaryChromaticities = exif.getAttribute(ExifInterface.TAG_PRIMARY_CHROMATICITIES)
                    ?.toFloatOrNull(),
                referenceBlackWhite = exif.getAttribute(ExifInterface.TAG_REFERENCE_BLACK_WHITE)
                    ?.toFloatOrNull(),
                relatedSoundFile = exif.getAttribute(ExifInterface.TAG_RELATED_SOUND_FILE),
                resolutionUnit = exif.getAttribute(ExifInterface.TAG_RESOLUTION_UNIT)
                    ?.toIntOrNull(),
                rowsPerStrip = exif.getAttribute(ExifInterface.TAG_ROWS_PER_STRIP)?.toIntOrNull(),
                rw2Iso = exif.getAttribute(ExifInterface.TAG_RW2_ISO)?.toIntOrNull(),
                rw2JpegFromRaw = exif.getAttribute(ExifInterface.TAG_RW2_JPG_FROM_RAW),
                rw2SensorBottomBorder = exif.getAttribute(ExifInterface.TAG_RW2_SENSOR_BOTTOM_BORDER)
                    ?.toIntOrNull(),
                rw2SensorTopBorder = exif.getAttribute(ExifInterface.TAG_RW2_SENSOR_TOP_BORDER)
                    ?.toIntOrNull(),
                rw2SensorLeftBorder = exif.getAttribute(ExifInterface.TAG_RW2_SENSOR_LEFT_BORDER)
                    ?.toIntOrNull(),
                rw2SensorRightBorder = exif.getAttribute(ExifInterface.TAG_RW2_SENSOR_RIGHT_BORDER)
                    ?.toIntOrNull(),
                samplesPerPixel = exif.getAttribute(ExifInterface.TAG_SAMPLES_PER_PIXEL)
                    ?.toIntOrNull(),
                saturation = exif.getAttribute(ExifInterface.TAG_SATURATION)?.toIntOrNull(),
                sceneCaptureType = exif.getAttribute(ExifInterface.TAG_SCENE_CAPTURE_TYPE)
                    ?.toIntOrNull(),
                sceneType = exif.getAttribute(ExifInterface.TAG_SCENE_TYPE),
                sensingMethod = exif.getAttribute(ExifInterface.TAG_SENSING_METHOD)?.toIntOrNull(),
                sharpness = exif.getAttribute(ExifInterface.TAG_SHARPNESS)?.toIntOrNull(),
                shutterSpeedValue = exif.getAttribute(ExifInterface.TAG_SHUTTER_SPEED_VALUE)
                    ?.toFloatOrNull(),
                software = exif.getAttribute(ExifInterface.TAG_SOFTWARE),
                spatialFrequencyResponse = exif.getAttribute(ExifInterface.TAG_SPATIAL_FREQUENCY_RESPONSE),
                spectralSensitivity = exif.getAttribute(ExifInterface.TAG_SPECTRAL_SENSITIVITY),
                stripByteCounts = exif.getAttribute(ExifInterface.TAG_STRIP_BYTE_COUNTS)
                    ?.toIntOrNull(),
                stripOffsets = exif.getAttribute(ExifInterface.TAG_STRIP_OFFSETS)?.toIntOrNull(),
                subfileType = exif.getAttribute(ExifInterface.TAG_SUBFILE_TYPE)?.toIntOrNull(),
                subjectArea = exif.getAttribute(ExifInterface.TAG_SUBJECT_AREA)?.toIntOrNull(),
                subjectDistance = exif.getAttribute(ExifInterface.TAG_SUBJECT_DISTANCE)
                    ?.toDoubleOrNull(),
                subjectDistanceRange = exif.getAttribute(ExifInterface.TAG_SUBJECT_DISTANCE_RANGE)
                    ?.toIntOrNull(),
                subjectLocation = exif.getAttribute(ExifInterface.TAG_SUBJECT_LOCATION)
                    ?.toIntOrNull(),
                subsecTime = exif.getAttribute(ExifInterface.TAG_SUBSEC_TIME),
                subsecTimeDigitized = exif.getAttribute(ExifInterface.TAG_SUBSEC_TIME_DIGITIZED),
                subsecTimeOriginal = exif.getAttribute(ExifInterface.TAG_SUBSEC_TIME_ORIGINAL),
                thumbnailImageLength = exif.getAttribute(ExifInterface.TAG_THUMBNAIL_IMAGE_LENGTH)
                    ?.toIntOrNull(),
                thumbnailImageWidth = exif.getAttribute(ExifInterface.TAG_THUMBNAIL_IMAGE_WIDTH)
                    ?.toIntOrNull(),
                transferFunction = exif.getAttribute(ExifInterface.TAG_TRANSFER_FUNCTION)
                    ?.toIntOrNull(),
                userComment = exif.getAttribute(ExifInterface.TAG_USER_COMMENT),
                whiteBalance = exif.getAttribute(ExifInterface.TAG_WHITE_BALANCE)?.toIntOrNull(),
                whitePoint = exif.getAttribute(ExifInterface.TAG_WHITE_POINT)?.toFloatOrNull(),
                xResolution = exif.getAttribute(ExifInterface.TAG_X_RESOLUTION)?.toFloatOrNull(),
                yCbCrCoefficients = exif.getAttribute(ExifInterface.TAG_Y_CB_CR_COEFFICIENTS)
                    ?.toFloatOrNull(),
                yCbCrPositioning = exif.getAttribute(ExifInterface.TAG_Y_CB_CR_POSITIONING)
                    ?.toIntOrNull(),
                yCbCrSampling = exif.getAttribute(ExifInterface.TAG_Y_CB_CR_SUB_SAMPLING)
                    ?.toIntOrNull(),
                yResolution = exif.getAttribute(ExifInterface.TAG_Y_RESOLUTION)?.toIntOrNull()
            )
        } catch (exception: Exception) {
            null
        }
    }
}
