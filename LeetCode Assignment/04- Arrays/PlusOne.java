//https://leetcode.com/problems/plus-one/
//Time complexity: The for loop iterates through the array from right to left, and in the worst case scenario, it visits each digit once. 
//Therefore, the time complexity of the for loop is O(n).
//The space required for the input array digits is O(n), 
//as it directly depends on the size of the input.
import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {4,3,2,1};
        System.out.println(Arrays.toString(plusOne(digits)));
    }

    public static int[] plusOne(int[] digits) {
        int n = digits.length;

        //add 1 to the least significant digit
        digits[n-1] += 1;

        //check for carry from right to left
        for(int i = n-1; i > 0; i--) {
            if(digits[i] == 10) {
                digits[i] = 0;
                digits[i - 1] += 1;
            }else {
                break; // no carry exit the loop
            }
        }
        // If there is a carry in the leftmost digit, create a new array with one additional digit
        if(digits[0] == 10) {
            int[] newDigits = new int [n+1];//The n + 1 expression calculates the length of the new array by adding 1 to the original length.
            newDigits[0] = 1; //After creating the new array, we set the leftmost digit to 1 (newDigits[0] = 1;)
            return newDigits;
        }
        return digits;
    }
}