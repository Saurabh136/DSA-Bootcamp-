import java.util.Arrays;

public class SortingSearchingInArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 6, 2, 4, 1};
        Arrays.sort(arr);

        System.out.println("Sorted Array: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int index = Arrays.binarySearch(arr, 5);

        if(index >= 0) {
            System.out.println("Element found at index: " + index);
        }else {
            System.out.println("Element not found ");
        }
    }
}
