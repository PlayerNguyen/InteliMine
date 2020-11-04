package com.github.playernguyen.intelimine.services

import com.intellij.openapi.project.Project
import com.github.playernguyen.intelimine.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
