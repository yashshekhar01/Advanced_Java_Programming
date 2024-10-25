import java.util.ArrayList;
import java.util.Collections;

public class ReverseList {
    public static void main(String[] args) {
        // Create an ArrayList of strings
        ArrayList<String> list = new ArrayList<String>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");

        System.out.println("Original List: " + list);

        // Reverse the list
        Collections.reverse(list);

        System.out.println("Reversed List: " + list);
    }
}
