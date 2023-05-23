public class SortedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,8};
        System.out.println(sorted(arr,0));
        
    }
    static boolean sorted(int[] arr,int index) {
        //base condition
        if(index == arr.length - 1) {
            return true;
        }
        return arr[index] < arr[index + 1] && sorted(arr,index + 1);
        // condition && recursion call
        //In recursion every reference variable calls to same object
        // that is why if we modify the array in any function call it will be modified in all other recursion calls 

    }
}