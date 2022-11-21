import java.util.Scanner;

public class SumOfNnumbers {
    
    public static void main(String[] args) {
        String choice = "";

        int sum = 0;
        int count = 0;
        Scanner in = new Scanner(System.in);

        while(!choice.equals("x")){
             System.out.println("Enter a number or x to quit");
             choice = in.next();

            if(!choice.equals("x")){

                int number = Integer.parseInt(choice);  //String to Integer
                sum = sum+number;
                count++;
            }
        } 
        System.out.println("Total Sum of Numbers is: " +sum);
    }
}
