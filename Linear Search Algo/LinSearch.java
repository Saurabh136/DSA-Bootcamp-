public class LinSearch {
     public static void main(String[]args) {
        int[] nums = {23,23,26,7,-3,-44,10};
        int target = 10;
        int ans = LinearSearch(nums, target);
        System.out.println(ans); 


     }
     //Search in the array; return the index if found
     //otherwise if item not found return -1
     static int LinearSearch(int[] arr,int target) {
        if(arr.length == 0) {
            return -1;
        }
        //run a for loop
        for(int index=0; index < arr.length; index++) {
            //check for element at every index
            int element = arr[index];
            if(element == target) {
                return index;
            }
        }
        //this line will execute if none of the return statements above have executed
        //hence the target not found
        return -1;
     }

}