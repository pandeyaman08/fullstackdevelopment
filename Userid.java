package javaproject;
import java.util.Scanner;

public class Userid {
    private static int userIdCounter = 1;  // Counter for user ID suffix

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            // Get user's name
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            // Get user's course
            System.out.print("Enter your course (Java/Python): ");
            String course = scanner.nextLine();

            // Generate user ID based on course
            String userId = generateUserId(course);

            // Display the user ID
            System.out.println("Your user ID is: " + userId);

            // Ask the user if they want to continue
            System.out.print("Do you want to continue? (yes/no): ");
            String continueInput = scanner.nextLine().toLowerCase();

            // Check if the user wants to continue
            if (!continueInput.equals("yes")) {
                break;
            }

        } while (true);

        // Close the scanner
        scanner.close();
    }

    // Method to generate user ID based on course
    private static String generateUserId(String course) {
        // Convert course name to lowercase for case-insensitive comparison
        String lowercaseCourse = course.toLowerCase();

        // Increment the user ID counter
        int currentCounter = userIdCounter++;

        // Check the course and generate the corresponding user ID
        if (lowercaseCourse.equals("java")) {
            return "java" + currentCounter;
        } else if (lowercaseCourse.equals("python")) {
            return "python" + currentCounter;
        } else {
            return "InvalidCourse";  // Handle invalid course
        }
    }
}
