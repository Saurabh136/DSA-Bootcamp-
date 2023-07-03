//https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/submissions/940527268/
//Time Complex: O(n) , The time complexity of this code is O(n), where n is the size of the input array, because the code iterates over the array only once, 
//either in the for loop for even n or in the for loop for odd n.
//Space Complex: O(n), because the algorithm creates an array of size n, 
//which takes up n units of space in memory. 
//Additionally, the algorithm uses a constant amount of additional memory for the loop variables and temporary variables, 
//which does not depend on the size of the input array. 
//Therefore, the overall space complexity is O(n).
import java.util.Arrays;

public class SumZero {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(Arrays.toString(sumZero(n)));
        
    }

    public static int[] sumZero(int n) {
        //initialize an integer array of size n
        int[] arr = new int[n];
        //if n is even, fill the array with alternating positive and negative integers
        if(n % 2 == 0) {
            for(int i = 0; i < n - 1; i = i + 2) {
                arr[i + 1] = i + 1;
                arr[i] = -(i + 1); 
            }
         //if n is odd, fill the array with alternating positive and negative integers up to the second-to-last index, 
         //and set the last index to 0    
        }else {
            for(int i = 0; i < n - 1; i = i + 2) {
                arr[i] = i + 1;
                arr[i + 1] = -(i + 1);
            }
            arr[n-1] = 0;
        }
        return arr;
    }
}
