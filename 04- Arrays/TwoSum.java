//https://leetcode.com/problems/two-sum/description/
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15}; 
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target)  {
         int[] ans = new int[2]; //new array of size 2 to store indices
         HashMap<Integer,Integer> map = new HashMap<>(); // creates a new HashMap called map to store the values and their indices as key-value pairs.
         for(int i = 0; i < nums.length; i++) { //It then loops through the input array nums using a for loop, and for each element nums[i], 
            //it checks if the target - nums[i] is present in the map using the containsKey method.
            if(map.containsKey(target - nums[i])){ //find compliment in hashmap here complement = target - nums[i]
                // If it is, it means that the two numbers that add up to the target have been found, 
                //so the indices are stored in the ans array and the loop is broken using the break statement
                ans[0] = i;
                 ans[1] = map.get(target - nums[i]);
                 break;
            }else { // If not, it means that the current element has not yet found its complement, 
                //so it is added to the map with its index as the value.
                map.put(nums[i], i);
            }
        }
        return ans; // Finally, the method returns the ans array containing the indices of the two numbers that add up to the target.
    }
}
