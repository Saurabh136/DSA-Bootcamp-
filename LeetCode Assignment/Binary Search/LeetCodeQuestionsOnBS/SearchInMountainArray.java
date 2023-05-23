

public class SearchInMountainArray {
    public static void main(String[] args) {
        int [] arr  = {1,2,3,4,5,3,1};
        int target = 3;
        
        System.out.println(search(arr,target));

    }

    //https://leetcode.com/problems/find-in-mountain-array/
    //find peak element
    //binary search in ascending array
    //if not found,binary search in descending array

    static int search(int[] arr, int target) {
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBS(arr, target, 0, peak);
        if(firstTry != -1) {
            return firstTry;
        }
        //try to search in second half
        return orderAgnosticBS(arr, target, peak + 1, arr.length - 1);

    }
    
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end) {
            int mid = start + (end-start) / 2;
         
           if(arr[mid] > arr[mid + 1]) {
                //you are in the decreasing part of array
                //this may be the answer but look at left
                // this is why end != mid -1
                end = mid;
            }else {
                //you are in the ascending part of an array
                start = mid + 1;
            }
            
        }
        //in the end , start == end and pointing to the largest number because of the two checks
        // start and end will always try to find the largest number in the above 2 checks
        //hence, when they are pointing to just one element, that is the max one
        //more elaboration: at every point of time for start and end, they have the best possible answer till that time
        //and if we are saying that only one item is remaining, hence cuz of above line that is the best possible ans
        return start; // or return end as both are =
    }
    static int orderAgnosticBS(int[] arr, int target,int start,int end) {
       

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

