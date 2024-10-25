import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Declare and initialize the stack
        Stack<Integer> stack = new Stack<>();

        // Store 10 elements into the stack
        for (int i = 1; i <= 10; i++) {
            stack.push(i); // Push elements 1 to 10 onto the stack
        }

        // Remove 4 elements from the stack
        for (int i = 0; i < 4; i++) {
            if (!stack.isEmpty()) {
                stack.pop(); // Pop the top element
            }
        }

        // Display the remaining elements in the stack
        System.out.println("Remaining elements in the stack: " + stack);
    }
}

