public class ArrayIndexExceptionDemo {
    public static void main(String[] args) {
        // Define an array of size 5
        int[] numbers = {1, 2, 3, 4, 5};

        // Attempt to access elements beyond the last index (which is 4)
        try {
            for (int i = 0; i <= numbers.length; i++) {  // Notice <= instead of <
                System.out.println("Element at index " + i + ": " + numbers[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: You tried to access an index that doesn't exist!");
        }
    }
}
