import java.util.Arrays;

public class MergeSortRec {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
        
    }

    static int[] mergeSort(int[] arr) {
        if(arr.length == 1) {
            return arr;
        }

        int middle = arr.length/2;  //Divide the array in two parts

        int left[] = mergeSort(Arrays.copyOfRange(arr, 0, middle)); //left part sorted
        int right[]= mergeSort(Arrays.copyOfRange(arr, middle, arr.length)); // right part sorted

        return merge(left,right);
    }

    private static int[] merge(int[] left, int[] right) {
        int[]mix = new int[left.length + right.length]; // combine of both part into one

        int i = 0; //pointer for 1st element of the left array
        int j = 0; // pointer for 1st element of the right array
        int k = 0; // pointer for the new combine array

        while(i < left.length && j < right.length) {
            if(left[i] < right[j]) { // here if left 1st element is less then right 1st element
                mix[k] = left[i]; // then add the left 1st element in the new array mix[k]
                i++; // then move on to the next element in the array and again compare i & j
            }else {
                mix[k] = right[j]; // if right is less then left 1st element then add that right element in mix[k]
                j++; // then move on to the next
            }
            k++;
        }

            //it may be possible that one of the array is not complete
            //copy the remaining elements
            //if i > left.length then the remaining element from right array will be added to mix
            // similarly if j > right.lenght then remaining of left is added to mix
            while(i < left.length) {
                mix[k] = left[i];
                i++;
                k++;
            }
            while(j < right.length) {
                mix[k] = right[j];
                j++;
                k++;
            }

            return mix;
        }
    
    
}
