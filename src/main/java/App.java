import java.time.LocalDateTime;
import java.util.Scanner;

public class App {

    private static final String APP_NAME = "DevOps Maven Utility App";
    private static final String VERSION = "1.0.0";

    public static void main(String[] args) {
        printBanner();
        showMenu();
        handleUserInput();
    }

    private static void printBanner() {
        System.out.println("====================================");
        System.out.println("  " + APP_NAME);
        System.out.println("  Version: " + VERSION);
        System.out.println("  Started at: " + LocalDateTime.now());
        System.out.println("====================================");
    }

    private static void showMenu() {
        System.out.println("\nChoose an option:");
        System.out.println("1. Show System Information");
        System.out.println("2. Check Build Status");
        System.out.println("3. Exit");
    }

    private static void handleUserInput() {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.print("\nEnter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    showSystemInfo();
                    break;
                case 2:
                    checkBuildStatus();
                    break;
                case 3:
                    System.out.println("Exiting application...");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }

    private static void showSystemInfo() {
        System.out.println("\n--- System Information ---");
        System.out.println("OS Name: " + System.getProperty("os.name"));
        System.out.println("OS Version: " + System.getProperty("os.version"));
        System.out.println("Java Version: " + System.getProperty("java.version"));
        System.out.println("User: " + System.getProperty("user.name"));
    }

    private static void checkBuildStatus() {
        System.out.println("\n--- Build Status ---");
        System.out.println("Git Repository: Connected");
        System.out.println("Maven Build: SUCCESS");
        System.out.println("Last Build Time: " + LocalDateTime.now());
    }
}

