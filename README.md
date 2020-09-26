This repo illustrates a Gradle build where `buildSrc` classes are used in the settings.gradle of the build.

Under Gradle 5.4.1 this is okay and no warnings are raised. To illustrate this, note the absence of any deprecation
warnings in the following output:

```
$ ./gradlew wrapper -q --gradle-version=5.4.1 --distribution-type=bin

$ ./gradlew --warning-mode all
==> BuildUtility: doSomething()

> Task :help

Welcome to Gradle 5.4.1.

[...]
```

- Gradle scan: https://scans.gradle.com/s/hy4p4jy3z2w4u

Note how under Gradle 5.6.4, this type of buildSrc usage has turned into a warning:

```
$ ./gradlew wrapper -q --gradle-version=5.6.4 --distribution-type=bin

$ ./gradlew --warning-mode all
Access to the buildSrc project and its dependencies in settings scripts has been deprecated. This is scheduled to be removed in Gradle 6.0.
        at settings_e0zckabl9fw6g5mv01g80zrhw.run(/GitHub/test-gradle-buildSrc/settings.gradle:12)
        (Run with --stacktrace to get the full stack trace of this deprecation warning.)
==> BuildUtility: doSomething()

> Task :help

Welcome to Gradle 5.6.4.

[...]
```

- Gradle scan: https://scans.gradle.com/s/ss557uduyz7xa
