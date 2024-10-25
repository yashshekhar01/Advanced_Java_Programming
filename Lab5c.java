import java.util.ArrayList;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        // Creating an ArrayList and adding integers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(5);
        numbers.add(8);
        numbers.add(21);
        numbers.add(10);
        numbers.add(3);

        int sum = 0;

        // Iterating through the ArrayList and summing the even numbers
        for (int number : numbers) {
            if (number % 2 == 0) { // Check if the number is even
                sum += number;
            }
        }

        // Output the result
        System.out.println("Sum of even numbers: " + sum);
    }
}
