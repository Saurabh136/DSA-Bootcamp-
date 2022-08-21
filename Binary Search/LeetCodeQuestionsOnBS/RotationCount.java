//https://www.geeksforgeeks.org/find-rotation-count-rotated-sorted-array/

public class RotationCount {
    public static void main(String[] args) {
        int arr[] = {7, 9, 11, 12, 5};   //here pivot is 12 and its index is 3, 
                                         //so pivot + 1 = ans, i.e 3 + 1= 4
        System.out.println(countRotations(arr));
    }
    private static int countRotations(int arr[]) {
        int pivot = findPivot(arr);  //this will sove this question
        return pivot + 1;            //pivot will show how many time the array is rotated

    }

    static int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if(mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if(mid > end && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            // if elements in the middle,start or end are equal then skip the duplicates
            if(arr[mid] == arr[start] && arr[mid] == arr[end]) {
                //skip the duplicates
                //Note: what if the elements at start and end were the pivots
                //check if start is pivot
                if(arr[start] > arr[start + 1]){
                    return start;
                }
                start++;
                //check if end is pivot or not
                if(arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            //left side is sorted , so pivot should be in right
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return -1;
    }
    //this will not work for duplicate value
    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if(mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if(mid > end && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if(arr[mid] <= arr[start]) {
                end = mid -1;
            }else {
                start = mid + 1;
            }
        }
        return -1;
    }


    
    
}
