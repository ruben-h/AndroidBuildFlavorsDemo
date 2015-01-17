# Demo of BuildFlavors in Android Studio and Gradle.

This is a sample project setup for a free and paid/donate version setup of an Android app. It is based on a default Android application, see git commits for changes.

Flavors are specified in /app/build.gradle

For each flavor theres a directory in /src with specific files like resources or java code.

You can use gradle tasks to install either flavors of the app, to a device or emulator, by running the task "installFreeDebug" or "installDonateDebug".

You could also create a free/paid/donate setup by using libraries and modules.

Note:

In previous versions of gradle, the naming was "packageName" and "buildConfig",
but now the correct names are: "applicationId" and "buildConfigField".

By [EnvyAndroid](http://envyandroid.com)

