// Importing the ArrayList class from the java.util package.
import java.util.ArrayList;

public class Question3 {
    public static void main(String[] args) {
        // Create the ArrayList of integers
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(2);
        numberList.add(5);
        numberList.add(8);
        numberList.add(10);
        numberList.add(15);

        // Calculate the sum of even numbers
        int sum = 0;
        for (int number : numberList) {
            if (number % 2 == 0) {
                sum += number;
            }
        }

        // Display the sum of even numbers
        System.out.println("Sum of even numbers: " + sum);
    }
}