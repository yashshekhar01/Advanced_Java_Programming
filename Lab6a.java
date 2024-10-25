import java.util.HashSet;

public class AppendToHashSet {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> set = new HashSet<>();

        // Add initial elements
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");

        // Display the HashSet before appending
        System.out.println("HashSet before appending: " + set);

        // Element to append
        String elementToAppend = "Grapes";

        // Append the specified element
        set.add(elementToAppend);

        // Display the HashSet after appending
        System.out.println("HashSet after appending: " + set);
    }
}
