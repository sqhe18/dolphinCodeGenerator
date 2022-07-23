package com.github.sqhe18.dolphincodegenerator.services

import com.intellij.openapi.project.Project
import com.github.sqhe18.dolphincodegenerator.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
