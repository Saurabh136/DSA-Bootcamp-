public class MaxElementInArray {
    public static void main(String[] args) {
        int[] arr = {21,22,23,24,25};
        System.out.println(max(arr));
    }

    // imagine that arr is not empty
    static int max(int[] arr) {
        int maxValue = arr[0];
        for(int i=0; i < arr.length; i++) {
            if(arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
    
}
