package com.github.dalidia.thrower.services

import com.intellij.openapi.project.Project
import com.github.dalidia.thrower.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
