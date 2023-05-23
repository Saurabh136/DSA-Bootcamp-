public class NumberOfGoodPairs {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        System.out.println(numIdenticalPairs2(nums));
        
    }
     // brut force approach
    // public static int numIdenticalPairs(int[] nums) {
    //     int ans = 0; //initialise
    //     for(int i = 0; i < nums.length; i++) {   //outer loop
    //         for(int j = i+1; j < nums.length; j++) {  //inner loop
    //            if(nums[i] == nums[j]) {
    //             ans++;
    //            }
    //         }
    //     }
    //     return ans;
    // }
    //optimize approach with Time complex: O[n] and Space complex: O[1]
    public static int numIdenticalPairs2(int[] nums) {
        int[] temp = new int[101]; // new array by name temp of size 101
        int result = 0; // new variable with name result which will store how many good pairs are there
        for(int i =0; i < nums.length; i++) {
            result += temp[nums[i]]; // it will store the sum in the result variable
            temp[nums[i]]++; // increment by 1
        }
        return result;

    }
}
