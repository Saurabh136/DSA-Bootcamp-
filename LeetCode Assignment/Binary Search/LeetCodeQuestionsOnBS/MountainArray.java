

public class MountainArray {
    public static void main(String[] args) {
        int [] arr = {1,3,4,7,4,2,9,4,3,2,0};
        System.out.println(peakIndexInMountainArray(arr));

    }

    //https://leetcode.com/problems/peak-index-in-a-mountain-array/
    //similar que with same soln : https://leetcode.com/problems/find-peak-element/submissions/
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
    
}
