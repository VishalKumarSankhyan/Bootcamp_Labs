import java.util.HashMap;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        // Create a new HashMap object to store phone book entries
        HashMap<String, String> phoneBook = new HashMap<>();
        
        // Create a new Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Initialize the user's choice to 0
        int choice = 0;
        
        // Loop until the user chooses to exit
        while (choice != 3) {
            // Display the menu options
            System.out.println("\n1. Find Number\n2. Add Number\n3. Exit");
            System.out.print("\nChoose An Option : ");
            
            // Read the user's choice
            choice = scanner.nextInt();
            
            // Consume the newline character left by nextInt()
            scanner.nextLine();
            
            // Perform the appropriate action based on the user's choice
            switch (choice) {
                case 1:
                    System.out.print("\nEnter Name to find number : ");
                    String name = scanner.nextLine();
                    
                    // Check if the phone book contains the specified name
                    if (phoneBook.containsKey(name)) {
                        System.out.println("Phone Number of " + name + " : " + phoneBook.get(name));
                    } else {
                        System.out.println(name + " not found in the Phone Book.");
                    }
                    break;
                case 2:
                    System.out.print("\nEnter Name : ");
                    String newName = scanner.nextLine();
                    
                    System.out.print("Enter Phone Number : ");
                    String newNumber = scanner.nextLine();
                    
                    // Add the new entry to the phone book
                    phoneBook.put(newName, newNumber);
                    
                    System.out.println("Successfully Added " + newName + " To The Phone Book.");
                    break;
                case 3:
                    System.out.println("Successfully Exit from Application");
                    break;
                default:
                    System.out.println("Invalid Choice. Please try again.");
            }
        }
    }
}