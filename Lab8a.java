import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        // Initialize TreeMap with some values
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("One", 1);
        treeMap.put("Three", 3);
        treeMap.put("Two", 2);

        // Display original TreeMap
        System.out.println("TreeMap: " + treeMap);

        // Remove the entry with the key "Two"
        Integer removedValue = treeMap.remove("Two");
        System.out.println("Removed value = " + removedValue);

        // Check if entry "Three=3" is removed
        boolean isThreeRemoved = !treeMap.containsKey("Three");
        System.out.println("Is the entry {Three=3} removed? " + isThreeRemoved);

        // Display updated TreeMap
        System.out.println("Updated TreeMap: " + treeMap);
    }
}
