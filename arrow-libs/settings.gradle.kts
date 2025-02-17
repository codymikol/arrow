/*

  This file includes the configuration of 'projectDir' beyond 'include' to
  allow working with:

    - All the libraries when opening 'arrow-libs'
    - CORE    libraries when opening 'arrow-libs/core'
    - FX      libraries when opening 'arrow-libs/fx'
    - OPTICS  libraries when opening 'arrow-libs/optics'
    - ANK     libraries when opening 'arrow-libs/ank'

  This distribution is also useful to publish the artifacts in case there is any limit about
  the number of artifacts in a single task.

*/
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
enableFeaturePreview("VERSION_CATALOGS")

rootProject.name = "arrow-libs"

pluginManagement {
  repositories {
    gradlePluginPortal()
    mavenCentral()
  }
}

dependencyResolutionManagement {
  versionCatalogs {
    create("libs") {
      from(files("../gradle/libs.versions.toml"))
    }
  }

  repositories {
    mavenCentral()
  }
}

// Core
include("arrow-core")
include("arrow-core-test")
include("arrow-annotations")
include("arrow-continuations")
include("arrow-meta:arrow-meta-test-models")
include("arrow-meta")
include("arrow-core-retrofit")

project(":arrow-core").projectDir = file("core/arrow-core")
project(":arrow-core-test").projectDir = file("core/arrow-core-test")
project(":arrow-annotations").projectDir = file("core/arrow-annotations")
project(":arrow-continuations").projectDir = file("core/arrow-continuations")
project(":arrow-meta:arrow-meta-test-models").projectDir =
  file("core/arrow-meta/arrow-meta-test-models")
project(":arrow-meta").projectDir = file("core/arrow-meta")
project(":arrow-core-retrofit").projectDir = file("core/arrow-core-retrofit")

// Fx
include("arrow-fx-coroutines")
include("arrow-fx-coroutines-test")
include("arrow-fx-stm")

project(":arrow-fx-coroutines").projectDir = file("fx/arrow-fx-coroutines")
project(":arrow-fx-coroutines-test").projectDir = file("fx/arrow-fx-coroutines-test")
project(":arrow-fx-stm").projectDir = file("fx/arrow-fx-stm")

// Optics
include("arrow-optics")
include("arrow-optics-test")

project(":arrow-optics").projectDir = file("optics/arrow-optics")
project(":arrow-optics-test").projectDir = file("optics/arrow-optics-test")

// Ank
include("arrow-ank")
include("arrow-ank-gradle")

project(":arrow-ank").projectDir = file("ank/arrow-ank")
project(":arrow-ank-gradle").projectDir = file("ank/arrow-ank-gradle")

include("jekyll")
project(":jekyll").projectDir = file("dokka/jekyll")

// Examples
include("examples")
