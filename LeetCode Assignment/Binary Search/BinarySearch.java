public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {12,34,56,31,10,17,-31,-16,20,26};
        int target = 10;
        int ans = binarysearch(arr, target);
        System.out.println(ans);

    }

    //return the index
    static int binarysearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // find the middle element
            int mid = start + (end - start) /2; 
            
            if(target < arr[mid]) {
                end = mid -1;
            } else if (target > arr[mid]) {
                start = mid + 1;  //now the target will be at the right side
            } else {
                // ans found
                return mid;
            }


        }
        return -1;

    }


}