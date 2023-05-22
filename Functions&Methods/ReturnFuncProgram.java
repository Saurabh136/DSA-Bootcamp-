import java.util.Scanner;

public class ReturnFuncProgram {
    public static void main(String[] args) {
        int ans = sum2();
        System.out.println("Sum of two numbers: "+ans);
        sum();
        int ans1= sum3(20,30);
        System.out.println("Sum of two numbers: " + ans1);
    }
    // return the value     method 1
    static int sum2() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1st number :");
        int num1 = in.nextInt();
        System.out.println("Enter 2nd number :");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;  // khatam tata bye bye, if return hits it means function is over bahar aa jao

    }

    // method 2 
    static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1st number :");
        int num1 = in.nextInt();
        System.out.println("Enter 2nd number :");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum of two numbers is : "+sum);
    }

    // method 3
    //pass the value of numbers when you are calling the method in main

    static int sum3(int a, int b) {
        int sum = a + b;
        return sum;
    }
}