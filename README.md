# imagery

Components and utilities for working with images in Kotlin. <br/>
<img alt="GitHub tag (latest by date)" src="https://img.shields.io/github/v/tag/chRyNaN/imagery">

Work In Progress.

## Using the library

The `Image` model contains everything necessary to represent an image and all of its associated data. All the models are
serializable with [kotlinx.serialization](https://github.com/Kotlin/kotlinx.serialization). To create an instance of
an `Image`, a URI is required that points to the image resource. All other fields are options.

```kotlin
val image = Image(
    uri = "https://example.com/image"
)
```

The `Image` model contains useful optional properties, such as `blurHash` and `focalPoint`.
A [BlurHash](https://blurha.sh/) can be used as a placeholder while the image resource is loading.
A [FocalPoint](https://github.com/jonom/jquery-focuspoint) keeps the most important part of the image visible when the
image is clipped.

A BlurHash for an image can be obtained using a `BlurHashEncoder`:

```kotlin
val encoder = BlurHashEncoder()

val blurHash = encoder.encode(
    pixelsArray,
    width,
    height,
    componentX,
    componentY,
)
```

When a BlurHash is obtained, it can be rendered to an image array that can be displayed while the image is loading.

```kotlin
val decoder = BlurHashDecoder()

val result = decoder.decode(
    blurHash,
    width,
    height,
    punch,
)

// The result.pixels array can be used to create a platform Bitmap object.
result.pixels
```

A `FocalPoint` is created by telling which coordinates in the image array are the most important.

```kotlin
FocalPoint(
    imageX,
    imageY,
    imageWidth,
    imageHeight
)
```

A `FocalPoint` can be used to get the area of the image that should be displayed if the view size is smaller than the
image, and the scale type is set to matrix.

```kotlin
val resolver = FocalPointResolver()

val result = resolver.resolve(
    viewWidth,
    viewHeight,
    imageWidth,
    imageHeight,
    focalPoint,
)

// The result object contains everything needed to create a platform matrix object to scale the image appropriately.
result.scale
result.dx
result.dy
```

### ImageCreator

An `ImageCreator` can be used to create instances of an `Image`, including all of its data, such as the Blur Hash, in a single function call.

```kotlin
val imageCreator = ImageCreator(blurHashEncoder, uriMimeTypeResolver)

val image = imageCreator.create(
        uri,
        width,
        height,
        pixels,
        blurHashComponentX,
        blurHashComponentY,
        focalPointX,
        focalPointY
)
```

## Building the library

The library is provided through [Repsy.io](https://repsy.io). Checkout
the [releases page](https://github.com/chRyNaN/colors/releases) to get the latest version. <br/>
<img alt="GitHub tag (latest by date)" src="https://img.shields.io/github/v/tag/chRyNaN/imagery">

### Repository

```groovy
repositories {
    maven { url = "https://repo.repsy.io/mvn/chrynan/public" }
}
```

### Dependencies

```groovy
implementation "com.chrynan.imagery:imagery-core:VERSION"
```

## Documentation

More detailed documentation is available in the [docs] folder. The entry point to the documentation can be
found [here](docs/index.md).

## License

```
Copyright 2021 chRyNaN

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
