public class Ceiling {
    
        public static void main(String[] args) {
            int[] arr = {2,3,5,9,14,16,18};
            int target = 15;
            int ans = ceiling(arr, target);
            System.out.println(ans);
            
        }
        // return the index of smallest no. >= target;
        static int ceiling(int[] arr, int target) {

            // but what if the target is greater then the greatest number in the array
            if(target > arr[arr.length-1]) {
                return -1;
            }
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
            return start;
        }
    }
    
    

