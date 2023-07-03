import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5,6,3,4,2,1};
        insertionsort(arr);
        selectionsort(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    static void insertionsort(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = i + 1; j > 0 ; j--) {
                if(arr[j] < arr[j-1]) {
                    swap(arr,j,j-1);
                }else {
                    break;
                }
            }
        }
    }

    static void selectionsort(int [] arr) {
        for(int i=0; i < arr.length; i++) {
            //find the minimum item in the remaining array and swap with correct index
            int lastIndex = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr,0,lastIndex);
            swap(arr,maxIndex,lastIndex);
        }
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for(int i=start; i <= end; i++) {
            if(arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    static void bubble(int[] arr) {
        boolean swapped;
        //run the steps n-1 times
        for(int i = 0; i < arr.length; i++) {
            swapped = false;

            //for each step , max item will come at last respective index
            for(int j = 1; j < arr.length - i; j++) {
              //swap if the item is smaller then the previous item
              if(arr[j] < arr[j - 1]) {
                //swap
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j-1] = temp;
                swapped = true;
              }  
            } 
            // if we did not swapped for a particular value of i, it means the array is sorted hence stop the program
            if(!swapped) {  //!false = true
                break;
            }
        }
    }
}