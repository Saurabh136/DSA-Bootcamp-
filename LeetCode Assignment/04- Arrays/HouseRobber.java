//Leetcode(Med) 198: https://leetcode.com/problems/house-robber/description/

//The time complexity of this solution is O(n), where n is the length of the input array nums. 
//This is because we iterate through the array once in the for loop, filling the dp array.

/* The space complexity is O(n) as well. We use an additional array dp of length n to store the maximum loot values at each index. 
Therefore, the space required is proportional to the size of the input array.*/

//Overall, both the time and space complexity of this solution are linear, O(n), where n is the length of the input array.

public class HouseRobber {
    public static void main(String[] args) {
        int[] nums = {2,7,9,3,1};
        System.out.println(rob(nums));
    }

    public static int rob(int[] nums) {
        //if only 1 element then return it
        if(nums.length < 2) {
            return nums[0]; // value at index 0
        }

        //create an array to store the maximum loot value at each index
        int[] dp = new int[nums.length];

        //Memoize maximum loot at first 2 indexes
        dp[0] = nums[0]; //if only 1 house , then value at index 0 is the loot
        dp[1] = Math.max(nums[0],nums[1]); // if only 2 houses, then maximum value among both of them is loot

        //use them to fill complete array
        //start from 2nd index as first two indexes are already memoize
        for(int i = 2; i < nums.length; i++) {
            //core logic
            // E.g for dp[2] = Math.max(2+9,7)--> Math.max(11,7)--> ans-> 11
            // so the maximum loot array will be dp = [2,7,11], as index 2 value is 11 now 
            // similarly we will do for the remaining index , then the array will become dp = [2,7,11,11,12]
            //As 12 is the last element then the maximum amount you can rob will be 12. 
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);

        }
        //return the last value of the maximum loot array 
        return dp[nums.length - 1];// this will be the maximum loot a robber can rob 
    }
}
