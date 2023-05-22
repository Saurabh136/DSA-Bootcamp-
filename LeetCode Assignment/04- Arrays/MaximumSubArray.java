//https://leetcode.com/problems/maximum-subarray/
//Time Complex: O(n), The time complexity of the given code is O(n), 
//where n is the length of the input array nums. 
//This is because the code iterates through the array exactly once, performing constant time operations at each iteration. 
//Therefore, the time complexity of the code is linear with respect to the size of the input array.
// Space Complex: O(1), meaning it uses a constant amount of extra space
//This is because the code only uses a few variables of constant size (maxSub, currentSum, and i) to keep track of the maximum subarray sum seen so far and the current subarray sum during each iteration. 
//The space used by these variables does not increase with the size of the input array, so the space complexity is constant.
//Therefore, the given code has a linear time complexity and a constant space complexity, 
//making it an efficient solution for the Maximum Subarray problem.
public class MaximumSubArray {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
       int maxSub = nums[0]; //initialize maxSub to be the first element of the array
       int currentSum = nums[0];//initialize currentSum to be the first element of the array
       for(int i = 1; i < nums.length; i++) {
        currentSum = Math.max(currentSum + nums[i], nums[i]); // update currentSum,e.g (-2 + 1, 1) = (-1,1), so currentSum=1
        maxSub = Math.max(maxSub, currentSum); // update maxSub, e.g max(-2,1), therefore maxSub = 1
       }
       return maxSub; // return the final maximum subarray sum
    }
}
