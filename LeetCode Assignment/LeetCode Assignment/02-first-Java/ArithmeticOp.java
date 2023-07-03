import java.util.Scanner;

//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

public class ArithmeticOp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int ans = 0;
        while(true) {
            System.out.print("Enter the operator: ");
            char op = in.next().trim().charAt(0);

            if(op == '+' || op == '-' || op == '*' || op == '/') {
                System.out.print("Enter first numbers: ");
                int num1 = in.nextInt();
                System.out.print("Enter second numbers: ");
                int num2 = in.nextInt();

                if(op == '+') {
                    ans = num1 + num2;
                }
                if(op == '-') {
                    ans = num1 - num2;
                }
                if(op == '*') {
                    ans = num1 * num2;
                }
                if(op == '/') {
                    ans = num1 / num2;
                } 
            }else if(op =='X' || op == 'x') {
                break;
            }else {
                System.out.println("Invalid operation.");
            }
            System.out.println("Answer : "+ans);
        }
        
    }
    
}
