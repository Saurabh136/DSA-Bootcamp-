import java.util.Scanner;

import java.util.Scanner;

public class PrimeComposite {
    public static void main (String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = reader.nextInt();
        int c = 2;

        if (num % c == 0)
           System.out.println("It is not a Prime number:");
        else
           System.out.println("It is a Prime number:"); 
          
         


    }
    
}
