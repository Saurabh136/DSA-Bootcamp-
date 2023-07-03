//Take 2 numbers as input and print the largest number.
import java.util.Scanner;

public class LargestOfTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = in.nextInt();
        System.out.print("Enter second number: ");
        int b = in.nextInt();

        int max = Math.max(a, b);
        System.out.println("Largest of two numbers is : " + max);
    }
    
}
