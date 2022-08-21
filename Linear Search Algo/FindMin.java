public class FindMin {
    public static void main(String[] args) {
        int[] arr = {18,20,24,28,31,77};
        System.out.println(min(arr));
    }

    //assume arr.length !=0
    //return the minimum value of an array
    static int min(int[] arr) {
        int ans = arr[0];
        for(int i =1; i < arr.length; i++) {
            if (arr[i] < ans) {
                ans= arr[i];
            }
        }
        return ans;

    }
    
}
