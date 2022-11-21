
import java.util.Scanner;
import java.text.NumberFormat;

//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest

public class SimpleInterest {
    public static void main(String[] args) {
        NumberFormat nf = NumberFormat.getInstance();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Principal amount: ");
        float p = in.nextFloat();
        System.out.println("Enter time in year: ");
        float t = in.nextFloat();
        System.out.println("Enter interest rate: ");
        float r = in.nextFloat();
        double si = (p * r * t)/100;
        System.out.println("The Simple interest is: " +nf.format (si));
     }
}
