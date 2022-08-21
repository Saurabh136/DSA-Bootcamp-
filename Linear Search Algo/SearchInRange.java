public class SearchInRange {
    public static void main(String[] args) {
        int[] arr= {18,20,24,28,31,77};
        int target= 31;
        System.out.println(linearSearch(arr , target, 1, 4));

        
    }

    static int linearSearch(int[] arr, int target, int start, int end) {
        if(arr.length ==0) {
            return -1;
        }

        //run for loop
        for(int index= start; index <= end; index++) {
            //check for element at every index if it is = target
            int element = arr[index];
            if(element == target) {
                return index;
            }
        }
        // this line will execute if none of the return statement is executed
        // hence the target is not found
        return -1;
    }
    
}
