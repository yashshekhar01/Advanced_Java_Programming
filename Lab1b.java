import java.util.Scanner; // Import Scanner class for input

public class MaxNumber {

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt(); // Store the first input in num1
        
        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt(); // Store the second input in num2
        
        // Use the ternary operator to find the maximum of two numbers
        int max = (num1 > num2) ? num1 : num2;
        
        // Print the result (the maximum number)
        System.out.println("The maximum number is: " + max);
        
        // Close the scanner object to avoid resource leaks
        scanner.close();
    }
}
