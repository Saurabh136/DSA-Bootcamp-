import java.util.Scanner;

public class HCFandLCM {
    public static void main(String[] args) {
        int x;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = in.nextInt();
        System.out.println("Enter Second number: ");
        int b = in.nextInt();
    
       int num1 = a;
       int num2 = b;

       while(b != 0) {
        x = b;
        b = a%b;
        a = x;
       }
       int hcf = a;
       int lcm = (num1 * num2)/hcf;
       System.out.println("\nHCF of "+ num1 + " and " + num2 + " is = " + hcf);
       System.out.println("\nLCM of "+ num1 + " and " + num2 + " is =" + lcm);
    }
    
}
