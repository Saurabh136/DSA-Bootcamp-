//Leetcode Medium(238): https://leetcode.com/problems/product-of-array-except-self/description/
//Time comp: O(n), where n is the length of the input array 'nums'. 
//This is because there are three separate loops in the code: one for calculating the left multiplication, one for calculating the right multiplication, 
//and one for storing the result in a new array. Each loop iterates through the entire array once, resulting in a linear time complexity.

//Space comp: O(n),where n is the length of the input array 'nums'. 
//This is because the code uses two additional arrays ('left' and 'right') of the same length as 'nums' to store the left and right multiplications, respectively. 
//Additionally, it creates another array ('ans') of the same length to store the final result. 
//Therefore, the space required is proportional to the size of the input array.

import java.util.Arrays;
public class ProductExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }

    public static int[] productExceptSelf(int[] nums) {

        //Array to store all left multiplication
        int[] left = new int[nums.length];

        //Array to store all right multiplication
        int[] right = new int[nums.length];

        //multiply the left part
        left[0] = 1;
        for(int i = 1; i < nums.length; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }

        //multiply the right part
        right[nums.length - 1] = 1;
        for(int i = nums.length - 2; i > -1; i--){
            right[i] = right[i + 1] * nums[i + 1];
        }

        //store the result in new array
        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            ans[i] = left[i] * right[i];
        }
        return ans;
    }
}
