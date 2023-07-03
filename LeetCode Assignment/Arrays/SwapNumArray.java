import java.util.Arrays;

public class SwapNumArray {
    public static void main(String[] args) {
        int[] arr = {21,22,23,24,25};
        //swap(arr,1,2);
        reverse(arr);

        System.out.println(Arrays.toString(arr));
    }

     static void swap( int[] arr ,int index1,int index2) {
         int temp= arr[index1];
         arr[index1]=arr[index2];
         arr[index2] = temp;

     }

    static void reverse(int[] arr) {   // Two pointer methods
        int start = 0;
        int end = arr.length-1;

        while(start < end) {
            //swap
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    
}
