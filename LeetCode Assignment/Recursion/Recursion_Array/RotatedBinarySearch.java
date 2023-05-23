public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 1, 2, 3};
        System.out.println(search(arr, 8, 0, arr.length-1));
        
    }
    static int search(int[]arr, int target, int start, int end) {
        if(start > end) {
            return -1;
        }

        int middle = start + (end-start) / 2; // finds middle element
        if(arr[middle] == target) {
            return middle;
        }

        if(arr[start] <= arr[middle]) {
            if(target >= arr[start] && target <= arr[middle]) {
                return search(arr, target, start, middle-1); // here search starts from start and end at middle
            }else {
                return search(arr, target, middle+1, end); //here search start from middle and end at the last element
            }
        }

        if(target >= arr[middle] && target <= arr[end]) {  //2nd half of the array
            return search(arr, target, middle+1, end); // search from middle to end
        }
            return search(arr, target, start, middle-1);
    }
    
}
