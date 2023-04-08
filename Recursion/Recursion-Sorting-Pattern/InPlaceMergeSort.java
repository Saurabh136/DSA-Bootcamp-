import java.util.Arrays;

public class InPlaceMergeSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        mergeSortInPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSortInPlace(int[] arr, int start, int end) {
        if(end - start == 1) {
            return;
        }

        int middle = (start + end)/2;  //Divide the array in two parts

        mergeSortInPlace(arr, start, middle); //first part of the array i.e {5, 4}
        mergeSortInPlace(arr, middle, end);  //second part of the array i.e {3, 2, 1}

        mergeInPlace(arr, start, middle, end); // full sorted merge array
    }

    private static void mergeInPlace(int[] arr, int start, int middle, int end) {
        int[]mix = new int[end - start]; // combine of both part into one

        int i = start; //pointer for 1st element of the left array
        int j = middle; // pointer for 1st element of the right array
        int k = 0; // pointer for the new combine array

        while(i < middle && j < end) {
            if(arr[i] < arr[j]) { // here if left 1st element is less then right 1st element
                mix[k] = arr[i]; // then add the left 1st element in the new array mix[k]
                i++; // then move on to the next element in the array and again compare i & j
            }else {
                mix[k] = arr[j]; // if right is less then left 1st element then add that right element in mix[k]
                j++; // then move on to the next
            }
            k++;
        }
            while(i < middle) {   // start is less then middle
                mix[k] = arr[i];  // add that to mix[k]
                i++;
                k++;
            }
            while(j < end) {    // middle is less then end
                mix[k] = arr[j]; // add that element in mix
                j++;
                k++;
            }

            for(int l = 0; l < mix.length; l++) {
                arr[start+l] = mix[l];
            }
        }
}
