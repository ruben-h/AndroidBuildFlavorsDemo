# Demo of BuildFlavors in Android Studio and Gradle.

This is a sample project setup for a free and paid/donate version setup of an Android app. It is based on a default Android application, see git commits for changes.

Flavors are specified in /app/build.gradle

For each flavor there is a directory in /src/<flavor> with specific files like resources or java code, that overrides the resources from /src/main

You can easily choose build variants from the UI in Android Studio, or you can use the gradle tasks from the commandline or gradle task selector: "installFreeDebug" or "installDonateDebug".

(You could also create a free/paid/donate setup by using libraries and modules instead of flavors.)

Note:

* In previous versions of gradle, the naming was "packageName" and "buildConfig",
but now the correct names are: "applicationId" and "buildConfigField".
* Only one of the /src/<flavor>/java folders will show "correctly" in blue in Android Studio, depending on the build variant you have selected
