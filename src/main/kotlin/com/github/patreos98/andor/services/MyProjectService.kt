package com.github.patreos98.andor.services

import com.intellij.openapi.project.Project
import com.github.patreos98.andor.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
