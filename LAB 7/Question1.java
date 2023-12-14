import java.util.HashSet;

public class Question1 {
    public static void main(String[] args) {
        // Create a new HashSet object
        HashSet<String> hashSet = new HashSet<String>();

        // Add elements to the HashSet
        hashSet.add("banana");
        hashSet.add("date");
        hashSet.add("apple");
        hashSet.add("cherry");

        // Print the original HashSet
        System.out.println("Original HashSet: " + hashSet);

        // Append an element to the HashSet
        hashSet.add("kiwi");

        // Print the updated HashSet
        System.out.println("Updated HashSet: " + hashSet);
    }
}