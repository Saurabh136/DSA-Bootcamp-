import java.util.Scanner;

public class SwitchStatements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a valid fruit name: ");
        String fruit = in.next();

        switch (fruit) {
            case "Mango":
               System.out.println("kokanacha Raja");
            break;
            case "Apple" :
               System.out.println("Kashmir ki shaan");
            break;
            case "Grapes":
              System.out.println("Nashik chi olakh");
            break;  
            default:
              System.out.println("Please enter a valid fruit:");        
        }

    }
    
}
