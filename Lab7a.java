import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Specify a key and value
        String key = "Apple";
        int value = 10;

        // Associate the specified value with the specified key
        map.put(key, value);

        // Print the contents of the HashMap
        System.out.println("HashMap contents: " + map);
    }
}
