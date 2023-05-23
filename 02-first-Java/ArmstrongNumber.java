import java.util.Scanner;

//To find Armstrong Number between two given number.
// An Armstrong number is a number which equals to the sum of the cubes of its individual digits.
// For example, 153 is an Armstrong number as −
// 153 = (1)3 + (5)3 + (3)3
// Ans= 1 + 125 + 27  =153

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num1 ,num2;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number: ");
        num1 = in.nextInt();
        System.out.println("Enter second number: ");
        num2 = in.nextInt();

        for(int i = num1; i < num2;i++) {
            int check,rem,sum=0;
            check = i;
            while(check != 0) {
                rem = check % 10;
                sum = sum + (rem*rem*rem);
                check = check / 10;
            }
            if(sum == i) {
                System.out.println(""+i+" is an Armstrong number.");
            }
        }
    }
}
