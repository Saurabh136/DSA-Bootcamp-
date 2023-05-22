import java.util.Scanner;

//Write a program to print whether a number is even or odd, also take input from user

public class EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        System.out.println(evenodd(n));
        
    }
    public static int evenodd(int n) {
        
        if(n % 2 == 0) {
            System.out.println("It is a Even number: ");   
        }else {
            System.out.println("It is a Odd number: ");
        }
        return n;
    }
}