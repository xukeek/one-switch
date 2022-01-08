package com.github.xukeek.oneswitch.services

import com.intellij.openapi.project.Project
import com.github.xukeek.oneswitch.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
