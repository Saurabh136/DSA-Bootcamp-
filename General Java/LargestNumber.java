import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int a = in.nextInt();
        System.out.println("Enter second number: ");
        int b = in.nextInt();
        System.out.println("Enter third number: ");
        int c = in.nextInt();
    //find the largest of this numbers
        // int max = a;
        // if (b > max) {
        //     max = b;    
        // }
        // if (c > max) {
        //     max = c;
        // }
       
        int max = Math.max(c, Math.max(a,b));
        
        System.out.println("Largest number: " +max);
    }
    
}
