import java.util.ArrayList;

public class C4_ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> list = new ArrayList<>();

        // Adding elements to the ArrayList
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        System.out.println("Initial List: " + list);

        // Removing an element by value
        list.remove("Banana");

        // Removing an element by index
        list.remove(1); // Removes "Cherry" (Index starts at 0)

        System.out.println("After Removal: " + list);

        // Adding more elements
        list.add("Mango");
        list.add("Orange");

        System.out.println("Final List: " + list);
    }
}
