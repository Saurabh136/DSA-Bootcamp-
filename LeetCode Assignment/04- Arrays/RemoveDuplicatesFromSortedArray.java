//Leetcode 26: https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
// Time complexity: O(n) , coz loop runs only once through each array element
//Space complexity : O(n), coz modification is done in given array only
public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
        
    }

    public static int removeDuplicates(int[] nums) {
        //check if array is null or empty
        if(nums.length == 0) {
            return 0;
        }
        int i = 0;
        for(int j = 1; j < nums.length; j++) {
            if(nums[j] != nums[i]) {   // looking for element which are different
                i++;   // move the i pointer by 1;
                nums[i] = nums[j]; // elements goes to nums[i]
            }
        }
        return i + 1; // coz it is the number of unique element
    }
}
