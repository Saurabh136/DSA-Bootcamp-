//To calculate Fibonacci Series up to n numbers.

import java.util.Scanner;

public class FiboSeriesUptoN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Fibonacci Series uptill : ");
        int n = in.nextInt();
        int a = 0;
        int b = 1;

        int i = 1;
        while(i <= n) {
            System.out.print(a + " , ");
            int temp = a + b;
            a = b;
            b = temp;
            i++;
        }
        
    }
    
}
