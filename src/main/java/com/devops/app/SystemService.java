package com.devops.app;

public class SystemService {

    public void showSystemInfo() {
        System.out.println("\n--- System Information ---");
        System.out.println("Operating System: " + System.getProperty("os.name"));
        System.out.println("OS Version: " + System.getProperty("os.version"));
        System.out.println("Java Version: " + System.getProperty("java.version"));
        System.out.println("User Name: " + System.getProperty("user.name"));
    }
}
