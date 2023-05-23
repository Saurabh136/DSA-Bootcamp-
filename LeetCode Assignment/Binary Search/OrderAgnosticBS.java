public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {-18,-2,-12,0,2,3,4,5,65,74,34,67,89};
        int target = 65;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);
        
    }

    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

         //find wheather the array is sorted in ascending order or descending
         boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            // find the middle element
            int mid = start + (end - start) /2;
            
            if (arr[mid] == target) {
                return mid;
            }

            if(isAsc) {
                if(target < arr[mid]) {
                    end = mid -1;
                } else {
                    start = mid + 1;  //now the target will be at the right side
                } 
            }else {
                if(target > arr[mid]) {
                    end = mid -1;
                } else {
                    start = mid + 1;  //now the target will be at the right side
                } 
            }
    

        }
        return -1;
    }
}
