public class FincUniqueNumber {
    public static void main(String[] args) {
        int [] arr = {2,6,3,4,2,6,4};
        System.out.println(ans(arr));
    }

    private static int ans(int[]arr) {
        int unique = 0; //initial value

        for(int n : arr) {   //for every number in an array
            unique ^= n; // EX-OR

        }  
        return unique;
            

    }
    
}
