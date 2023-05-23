import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Fibonacci series uptill : ");
        int n = in.nextInt();
        int a = 0;
        int b = 1;

       // using for loop :
        // for(int i = 1 ; i <= n ; ++i) {
        //     System.out.print(a + ", ");

        //     int temp = a + b;
        //     a = b;
        //     b = temp;
        // }

        //using while loop :
        int i = 1;
        while (i <= n) {
            System.out.print(a + " , ");

            int temp = a + b;
            a = b ;
            b = temp;
            i++;



    
        }
    
    }
    
}
