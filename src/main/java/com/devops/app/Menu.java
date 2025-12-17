package com.devops.app;

import java.util.Scanner;

public class Menu {

    private final SystemService systemService = new SystemService();
    private final BuildService buildService = new BuildService();

    public void start() {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            printMenu();
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    systemService.showSystemInfo();
                    break;
                case 2:
                    buildService.showBuildStatus();
                    break;
                case 3:
                    System.out.println("Application exited successfully.");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
        scanner.close();
    }

    private void printMenu() {
        System.out.println("\n===== DevOps Maven Utility =====");
        System.out.println("1. Show System Information");
        System.out.println("2. Show Build Status");
        System.out.println("3. Exit");
    }
}
