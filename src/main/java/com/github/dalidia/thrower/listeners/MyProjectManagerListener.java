package com.github.dalidia.thrower.listeners;

import com.intellij.openapi.project.ProjectManagerListener;
import com.intellij.openapi.project.Project;

public class MyProjectManagerListener implements ProjectManagerListener {

    @Override
    public void projectOpened(Project project) {
        project.getService(getClass());
    }
}
