//https://prepinsta.com/infosys-sp-and-dse/coding-questions/


import java.util.*;
public class BirthDayIntegerArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int k, n; // input = n = 3(integer, n, denoting the maximum possible value in the arrays.) k = 2(integer, k, denoting the length of the arrays.) op= 5
        n = sc.nextInt();
        k = sc.nextInt();
        System.out.println(countt(n, k));
    }
 
    static int counter(int n, int k) {
        int count = 0;
        if (k == 1)
            return n;
        else {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (j % i == 0)
                        count++;
                }
            }
        }
        return count;
    }
 
    static int countt(int n, int k) {
        if (k == 1)
            return n;
        if (k == 2) {
            return counter(n, k);
        }
        int mid = k / 2;
        int x = countt(n, k - mid);
        int y = counter(n, mid);
        return x + y - 1;
    }
}