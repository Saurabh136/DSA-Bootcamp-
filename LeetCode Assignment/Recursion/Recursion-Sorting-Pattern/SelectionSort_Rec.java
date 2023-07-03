import java.util.Arrays;

public class SelectionSort_Rec {
    public static void main(String[] args) {
        int[]arr={4,3,2,1};
        selectionSort(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
        
    }

    static void selectionSort(int[]arr,int row, int column, int max) {
        if(row == 0) {
            return;
        }
        if(column < row) {
            if(arr[column] > arr[max]) {   //here max is taken as index number not any value
                selectionSort(arr, row, column + 1, column);
            } else {
                selectionSort(arr, row, column+1, max);
            }
        } else {
            int temp = arr[max];
            arr[max] = arr[row-1];
            arr[row-1] = temp;
            selectionSort(arr, row-1, 0, 0);
        }
    }
    
}
