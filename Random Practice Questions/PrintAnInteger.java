import java.util.Scanner;

public class PrintAnInteger {


 public static void main(String[] args) {
    //create a reader intance which takes
    //which takes input 
    Scanner reader = new Scanner(System.in);
    System.out.print("Enter a number: ");

    //nextInt() read the next integer from keyboard
    int number = reader.nextInt();

    System.out.println("You Entered: "+ number);
    
  }
}