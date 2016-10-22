# SimplestAndroidLibrary [![Build Status](https://travis-ci.org/sadegh/SimplestAndroidLibrary.png)](https://travis-ci.org/sadegh/SimplestAndroidLibrary)
A sample android library which demonstrates how to push your library into the maven.

# Usage

Add Sonatype snapshot repository to your project repositories, your root `build.gradle` should be as follows:

<pre>
allprojects {
    repositories {
        jcenter()
        maven { url "https://oss.sonatype.org/content/repositories/snapshots" }
    }
}
</pre>

Then add the following dependency to you app:
<pre>  compile 'ir.sirlate:simplest-android-library:0.0.1-SNAPSHOT' </pre>
