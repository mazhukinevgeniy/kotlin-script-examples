#!/usr/bin/env kotlin

println("hello folks")

// checkout and downloading of utils managed by teamcity

val dslConcept = """
    GradleProfilerExecutor {
        baseConfig {
            kotlinArtifactVersions = 
        }
    
        scenario {
            changeAbi(inFile)
            
        }
        
        scenario {
        
        }
        
        //well actually it should be mostly the same as current benchmarks
    }
""".trimIndent()

println(dslConcept)

val importantInternals = """
    responsibility of TC / Executor app:
    1. provide/download tools (e.g. gradle profiler)
    2. check out repo [might be just a logged param in TC context? we can even print warning "expected SHA 123 but got SHA 234"?]
    3. 
""".trimIndent()