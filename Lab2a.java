// Import the Scanner class to take user input
import java.util.Scanner;

public class StrongNumber {

    // Method to calculate factorial of a digit
    public static int factorial(int n) {
        int fact = 1; // Initialize fact to 1
        for (int i = 1; i <= n; i++) { // Loop to calculate factorial
            fact *= i; // Multiply fact by i at each step
        }
        return fact; // Return the factorial of the digit
    }

    public static void main(String[] args) {
        // Create a Scanner object to read input from user
        Scanner sc = new Scanner(System.in);

        // Ask the user to input a number
        System.out.print("Enter a number: ");
        int num = sc.nextInt(); // Read the input number
        int originalNum = num; // Store the original number for later comparison
        int sum = 0; // Initialize sum to 0 to store sum of factorial of digits

        // Loop to extract each digit and calculate factorial
        while (num > 0) {
            int digit = num % 10; // Get the last digit of the number
            sum += factorial(digit); // Add factorial of the digit to sum
            num /= 10; // Remove the last digit from the number
        }

        // Check if sum of factorial of digits is equal to the original number
        if (sum == originalNum) {
            System.out.println(originalNum + " is a Strong number.");
        } else {
            System.out.println(originalNum + " is not a Strong number.");
        }

        // Close the Scanner object
        sc.close();
    }
}
