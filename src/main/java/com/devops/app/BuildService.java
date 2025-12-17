package com.devops.app;

import java.time.LocalDateTime;

public class BuildService {

    public void showBuildStatus() {
        System.out.println("\n--- Build Status ---");
        System.out.println("Git Working Tree: CLEAN");
        System.out.println("Maven Build: SUCCESS");
        System.out.println("Artifact: maven-project-1.1.0.jar");
        System.out.println("Build Time: " + LocalDateTime.now());
    }
}
