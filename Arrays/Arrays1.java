
import java.util.Arrays;
import java.util.Scanner;
import java.lang.String;

public class Arrays1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        //Array Syntax
        // datatype[] variable_name = new datatype[size];

        // Store 5 roll numbers
         //Array of primitive

        //int[] rollnums = new int[5];
        //or directly
        //int[] rollnums2 = {21,20,12,30,34}; 
        // System.out.println(rollnums);
         //System.out.println(rollnums2);

        // Input using loops
        // for(int i = 0; i < rollnums.length; i++) {
        //     rollnums[i] = in.nextInt();
        // }

        // for(int i = 0; i < rollnums.length; i++) {    // Method 1 to print array
        //     System.out.print(rollnums[i] + " ");
        // }
        //System.out.println(Arrays.toString(rollnums));   // Method 2 to print array

        //Array of objects
        String[] str = new String[4];
        for(int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }

        System.out.println(Arrays.toString(str));

        //modify
        str[1] = "Saurabh";    // changing the object at reference varibale 1 in an array
        System.out.println(Arrays.toString(str));
            
        
    }

    

    
}