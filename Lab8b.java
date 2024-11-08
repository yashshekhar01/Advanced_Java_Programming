import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        // Initialize TreeMap with some values
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("One", 1);
        treeMap.put("Three", 3);
        treeMap.put("Two", 2);

        System.out.println("TreeMap: " + treeMap);

        // Method 1: Using entrySet() with enhanced for loop
        System.out.println("Using entrySet() with enhanced for loop:");
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        // Method 2: Using keySet() with enhanced for loop
        System.out.println("\nUsing keySet() with enhanced for loop:");
        for (String key : treeMap.keySet()) {
            System.out.println(key + " = " + treeMap.get(key));
        }

        // Method 3: Using values() to iterate over values only
        System.out.println("\nUsing values() to iterate over values:");
        for (Integer value : treeMap.values()) {
            System.out.println(value);
        }

        // Method 4: Using forEach() method (Java 8+)
        System.out.println("\nUsing forEach() method:");
        treeMap.forEach((key, value) -> System.out.println(key + " = " + value));

        // Method 5: Using iterator over entrySet
        System.out.println("\nUsing iterator over entrySet:");
        var iterator = treeMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        // Method 6: Using descendingMap() for reverse order
        System.out.println("\nUsing descendingMap() for reverse order:");
        for (Map.Entry<String, Integer> entry : treeMap.descendingMap().entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
