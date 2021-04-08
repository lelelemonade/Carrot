package com.github.lelelemonade.carrot.services

import com.github.lelelemonade.carrot.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
