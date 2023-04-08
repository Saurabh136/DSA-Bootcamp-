import java.util.Arrays;

public class QuickSortRec {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

        
    }

    static void sort(int[] nums, int low, int high) {  // the low and high is the part of the array we are working on basically like a index pointers.
        if(low >= high) {
            return;
        }

        int start = low;
        int end = high;
        int mid = start + (end - start)/2; // here we consider middle element as a pivot element
        int pivot = nums[mid];

        //condition for swap
        while (start <= end) {
            //also a reason why if its already sorted it will not swap
            while(nums[start] < pivot) {
                start++;
            }
            while(nums[end] > pivot) {
                end--;
            }
            // here swap the array to eliminate the violations
            if(start <= end) {
               int temp = nums[start];
               nums[start] = nums[end];
               nums[end] = temp;
               start++;
               end--; 
            }

        }

        //now my pivot is at correct index, please sort two halves now
        sort(nums, low, end);
        sort(nums, start, high);
    }
    
}
