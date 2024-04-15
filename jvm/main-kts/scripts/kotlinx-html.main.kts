#!/usr/bin/env kotlin

@file:Repository("/home/Evgenii.Mazhukin/.m2")
@file:Repository("https://repo.gradle.org/gradle/libs-releases")
@file:Repository("https://repo1.maven.org/maven2")
@file:DependsOn("org.jetbrains:kotlin-build-benchmarks:1.0-SNAPSHOT")

import org.jetbrains.kotlin.build.benchmarks.dsl.*

val addressee = args.firstOrNull() ?: "World"

val bar = suite {
    val buildSrc = changeableFile("buildSrc/BuildPropertiesExtKt")
    val noArgs = arrayOf<String>()

    scenario("\$jdkPrefix\${prefix}(buildSrc, Kotlin) add private fun") {
        jdk = System.getenv("JDK_8")

        step {
            changeFile(buildSrc, TypeOfChange.ADD_PRIVATE_FUNCTION)
            runTasks(*noArgs)
        }
    }

    scenario("tt") {
        jdk = System.getenv("JDK_8")

        expectSlowBuild("reasons")
        step {
            changeFile(buildSrc, TypeOfChange.ADD_PRIVATE_FUNCTION)
            runTasks(*noArgs)
        }
        step {
            changeFile(buildSrc, TypeOfChange.ADD_PRIVATE_FUNCTION)
            runTasks(*noArgs)
        }
    }
}

println(bar.toString())
println(bar.scenarios.size)
println(bar.scenarios.joinToString(" also "))