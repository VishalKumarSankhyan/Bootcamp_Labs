import java.util.Stack;

public class Question2 {
    public static void main(String[] args) {
        // Create a new Stack object
        Stack<Integer> stack = new Stack<Integer>();

        // Add elements to the Stack
        stack.push(23);
        stack.push(33);
        stack.push(43);
        stack.push(53);
        stack.push(33);
        stack.push(63);
        stack.push(73);
        stack.push(83);
        stack.push(93);
        stack.push(13);

        // Print the original Stack
        System.out.println("-- elements --");
        System.out.println(stack);

        // Remove 4 elements from the Stack
        for (int i = 0; i < 4; i++) {
            stack.pop();
        }

        // Print the updated Stack
        System.out.println("\nAfter remove");
        System.out.println(stack);
    }
}