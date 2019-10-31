# android-junit5 [![CircleCI](https://circleci.com/gh/mannodermaus/android-junit5/tree/master.svg?style=svg)][circleci]

![Logo](.images/logo.png)

A Gradle plugin that allows for the execution of [JUnit 5][junit5gh] tests in Android environments using **Android Gradle Plugin 3.2.0 or later.**

## How?

This plugin configures the unit test tasks for each build variant of a project to run on the JUnit Platform. Furthermore, it provides additional configuration options for these tests [through a DSL][wiki-dsl] attached to `android.testOptions`.

Instructions on how to write JUnit 5 tests can be found [in their User Guide][junit5ug].
Furthermore, this repository provides a small showcase of the functionality provided by JUnit 5 [here][sampletests].
