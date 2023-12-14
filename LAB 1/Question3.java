import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number -> ");
        int num = sc.nextInt();
        System.out.print("Enter the bit position -> ");
        int n = sc.nextInt();
        int bitMask = (num >> n) & 1;

        if (bitMask == 1) {
            System.out.println("The nth bit of " + num + " is set (1).");
        } else {
            System.out.println("The nth bit of " + num + " is not set (0).");
        }
        sc.close();
    }
}
