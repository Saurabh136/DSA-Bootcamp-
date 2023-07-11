//Leetcode(Med) 75: https://leetcode.com/problems/sort-colors/description/
//Time comp: O(n)
//Space comp: O(1)
/*This indicates that the array has been sorted according to the problem requirements. 
The sortColors method implements the Dutch National Flag algorithm to sort the colors in linear time complexity (O(n)) and constant space complexity (O(1)) */
import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[]nums = {2,0,2,1,1,0};
        sortColors(nums);
        System.out.println("Sorted Array: " + Arrays.toString(nums));
        
    }

    public static void sortColors(int[] nums){
        int start = 0;
        int middle = 0;
        int end = nums.length - 1;

        while(middle <= end) {

            switch(nums[middle]) {
                case 0:
                //swap with start index , if it is 0
                swap(nums,start,middle);
                middle++;
                start++;
                break;

                case 1:
                //if the number is 1, no swapping in the middle, just move the middle pointer ahead
                middle++;
                break;

                case 2:
                //swap with end index , if it is 2
                swap(nums,middle,end);
                end--;
                break;

            }
        }
    }

    private static void swap(int[] arr, int pos1, int pos2) {
        int temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }
    
}
