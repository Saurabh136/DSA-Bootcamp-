//Leetcode 189: https://leetcode.com/problems/rotate-array/description/

/*The time complexity of the above code is O(n), where n is the length of the input array nums. This is because the code performs three reverse operations, each of which takes O(n) time. 
The reverse method runs in O(n/2) time, but in the context of big O notation, the constant factor of 1/2 is ignored, resulting in an overall time complexity of O(n). */

/*The space complexity of the code is O(1), which means it uses constant space. 
The space required by the code does not depend on the input size but only on a few variables and temporary storage for swapping elements during the reverse operation. 
Regardless of the size of the input array, the additional space used by the code remains constant. */


public class RotateArray {
    public static void main(String[] args) {
        int[]nums = {1,2,3,4,5,6,7}; 
        int k = 3;
        rotate(nums, k);

        // Print the rotated array
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
    public static void rotate(int[]nums, int k) {
    //calculates the effective number of steps to rotate by using the modulo operator %. 
    //If k is greater than the length of the array, it wraps around to the beginning, ensuring the rotation is within the array size.
    k = k % nums.length;
    reverse(nums,0,nums.length-1);/*  calls the reverse method to reverse the entire array. 
    This operation effectively rotates all elements to the right by nums.length steps, which has no effect on the final rotation result but simplifies subsequent operations.*/
    reverse(nums,0,k-1); /* calls the reverse method to reverse the first k elements of the array. 
    This operation brings the last k elements (which are the ones that need to be rotated to the beginning) to the front. */
    reverse(nums,k,nums.length-1); /* calls the reverse method to reverse the remaining elements of the array, excluding the already reversed first k elements. 
    This step ensures the elements that were initially at the end are now at the end after the rotation. */
    }

    public static void reverse(int[]nums, int start, int end){
        /*The reversal is performed using a while loop with two pointers, 
        start and end, initially pointing to the specified range's start and end elements, respectively. */
        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            /*After the swap, the start index is incremented, 
            and the end index is decremented, moving towards the center of the range. */
            start++;
            end--;
            /*The loop continues until start becomes greater than or equal to end, ensuring all elements within the range have been reversed. */
        }
    }
}
