import java.util.Arrays;

// 1480. Running Sum of 1d Array
// https://leetcode.com/problems/running-sum-of-1d-array/

// --Brut Force Approach--
//   int[] ans = new int[n];
//   for(int i = 0; i < n; i++) {
//     for(int j = 0; j<=i; j++) {
//         ans[i] += nums[j];
//     }
//   }
//   Time Complex: O(n^2) //coz 2 loops are running
//   Space complex : O(n) // we create a new array to store answer

//   // Optimize approach
// To optimize solution and making Time comp: O(n) and Space Comp: O(1)
// -----  for(int i = 1; i < n; i++) {
//       nums[i] = nums[i] + nums[i - 1];
// }
// return nums;

// if given array is nums = [1,2,3,4] then this above logic will work like this
//      nums[1] = 2 + 1 = 3-- op=[1,3,3,4] // nums[1] = 2 and nums[1-1] = 1
//      nums[2] = nums[2] + nums[2 - 1] = 3 + 3 = 6 -- op = [1,3,6,4]
//      nums[3] = nums[3] + nums[3 - 1] = 4 + 6 = 10   op = [1,3,6,10]---answer



     public class RunningSumOfArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(nums)));
        
    }

    public static int[] runningSum(int[] nums) {
        for(int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];  //nums[1] = nums[1] + nums[1-1] = 2 + 1 = 3 
        }
        return nums;
        
    }
    
}
