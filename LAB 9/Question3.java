import java.util.Scanner;
import java.util.TreeMap;

public class Question3 {
    public static void main(String[] args) {
        // Create a new TreeMap object to store name-age pairs
        TreeMap<String, Integer> nameAgePairs = new TreeMap<>();

        // Add some name-age pairs to the TreeMap
        nameAgePairs.put("Alice", 25);
        nameAgePairs.put("Bob", 30);
        nameAgePairs.put("Charlie", 35);
        nameAgePairs.put("Dave", 40);

        // Create a new Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an age to search for
        System.out.print("Enter an age to search: ");
        int ageToSearch = scanner.nextInt();

        // Iterate through the entries in the TreeMap and check if the entered age matches any of the values
        boolean foundMatch = false;
        for (String name : nameAgePairs.keySet()) {
            int age = nameAgePairs.get(name);
            if (age == ageToSearch) {
                System.out.println("Name with age " + ageToSearch + ": " + name);
                foundMatch = true;
            }
        }

        // If no match was found, display a message indicating that no name was found with the entered age
        if (!foundMatch) {
            System.out.println("No name was found with the entered age.");
        }
    }
}