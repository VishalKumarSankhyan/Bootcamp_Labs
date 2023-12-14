import java.util.HashMap;

public class Question2 {
  public static void main(String[] args) {
    // Create a new HashMap
    HashMap<String, Integer> map = new HashMap<>();

    // Add elements to the HashMap
    map.put("One", 1);
    map.put("Two", 2);
    map.put("Three", 3);

    // Check if the HashMap is empty
    boolean isEmpty = map.isEmpty();
    System.out.println("Is the HashMap empty ? : " + isEmpty);

    // Clear the HashMap
    map.clear();

    // Check if the HashMap is empty after clearing
    isEmpty = map.isEmpty();
    System.out.println("Is the HashMap empty after clearing? : " + isEmpty + " in java");
  }
}