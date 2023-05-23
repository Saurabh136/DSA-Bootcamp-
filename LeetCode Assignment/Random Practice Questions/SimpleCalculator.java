import java.util.Scanner;

class SimpleCalculator {
    public static void main(String args []) {
        char operator;
        Double number1,number2,result;

        //create an object of scanner class
        Scanner input = new Scanner(System.in);

        //ask user to enter operator
        System.out.println("Choose an operator: +,-,*,or /");
        operator = input.next().charAt(0);
        
        //ask user to enter  numbers
        System.out.println("Enter first number: ");
        number1 = input.nextDouble();

        System.out.println("Enter Second number: ");
        number2 = input.nextDouble();

        switch(operator) {

            //perform addition between numbers
            case '+':
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;
            //perform subtraction between numbers
            case '-':
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;
            case '*':
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;
            case '/':
                result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);
                break;
            default:
                System.out.println("Invalid operator!");
                break;                        
        }

        input.close();
    }
}

    
    
