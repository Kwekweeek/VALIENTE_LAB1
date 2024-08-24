import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {
        // Scanner object to capture user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for a number
        System.out.print("Enter number: ");
        int n = scanner.nextInt();

        // Generate the upper part of the pattern
        for (int i = 1; i <= n; i++) {
            System.out.print("*"); // Start each line with an asterisk
            for (int j = 1; j <= i; j++) {
                System.out.print(j); // Print increasing sequence of numbers
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j); // Print decreasing sequence of numbers
            }
            System.out.println("*"); // End each line with an asterisk
        }

        // Generate the lower part of the pattern
        for (int i = n - 1; i >= 1; i--) {
            System.out.print("*"); // Start each line with an asterisk
            for (int j = 1; j <= i; j++) {
                System.out.print(j); // Print increasing sequence of numbers
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j); // Print decreasing sequence of numbers
            }
            System.out.println("*"); // End each line with an asterisk
        }

        // Close the scanner to free up resources
        scanner.close();
    }
}
