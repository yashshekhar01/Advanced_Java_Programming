import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CricketerScores {
    public static void main(String[] args) {
        // Create a Map to store cricketer names and their scores
        Map<String, Integer> cricketerScores = new HashMap<>();

        // Add some cricketers and their scores
        cricketerScores.put("Virat Kohli", 12000);
        cricketerScores.put("Sachin Tendulkar", 18426);
        cricketerScores.put("Rohit Sharma", 10000);
        cricketerScores.put("Brian Lara", 11953);

        // Create a Scanner to get user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the cricketer's name to search for their score: ");
        String name = scanner.nextLine();

        // Search for the cricketer's score
        if (cricketerScores.containsKey(name)) {
            System.out.println(name + "'s score is: " + cricketerScores.get(name));
        } else {
            System.out.println("Cricketer not found.");
        }

        // Close the scanner
        scanner.close();
    }
}
