//Leetcode 55 Med: https://leetcode.com/problems/jump-game/description/
/*Time Complexity:
The time complexity of the canJump method is O(n), 
where n is the length of the input array nums. 
The method iterates through the array in reverse order exactly once, comparing each element with the current destination index. 
Therefore, the time complexity is linear with respect to the size of the input array.*/
/*Space Complexity:
The space complexity of the code is O(1), 
which means it uses constant space. 
The only additional space used is for the currentDest variable, 
which is an integer and does not depend on the size of the input array.
 Regardless of the length of the array, the space used by the algorithm remains constant. */

public class JumpGame {
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1, 4}; // Array of integers representing jump lengths
        System.out.println(canJump(nums)); // Calling the canJump method and printing the result
    }

    public static boolean canJump(int[] nums) {
        int currentDest = nums.length - 1; // Setting the current destination to the last index of the array

        // Iterating backwards through the array
        for (int i = nums.length - 1; i >= 0; i--) {
            // If the current jump length (nums[i]) can reach or exceed the current destination (currentDest),
            // update the current destination to the current index (i)
            if (nums[i] + i >= currentDest) {
                currentDest = i;
            }
        }

        // If the current destination is at the beginning of the array (index 0), return true
        if (currentDest == 0) {
            return true;
        }

        // If the current destination is not at the beginning of the array, return false
        return false;
    }
}

