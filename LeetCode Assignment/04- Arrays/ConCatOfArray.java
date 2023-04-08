import java.util.Arrays;

// import java.util.Arrays;

// 1929. Concatenation of Array
// https://leetcode.com/problems/concatenation-of-array/

// Input: nums = [1,2,1]
// ans[i + n]= ans[i]
// ans[1 + 3] = ans[1] // i= 1(value at index 0) = ans at value at index 3
// ans[2 + 3] = ans[2] // i= 2(value at index 1 ) = value at index 4
// ans [1 + 3] = ans[1] // i= 1(value at index 2) = value at index 5

// approach----
// int[] ans[2 * n];
// for(int i =0; i < n; i++) {
//     ans[i] = nums[i];  //here value at index 0 of nums[] is same  at index 0 of ans[]
//     ans[i + n]= nums[i]; // here value at index 0 of nums[] is same at index [i + n] i.e if value is i=1 and array size is n=3 then ans(1+3)=4 , so index 4 will have same value as index 0;

// }
// return ans;


//Time comp = O(n);
//Space comp = O(2n) --> ignoring constant O(n)
public class ConCatOfArray {
    public static void main(String[] args) {
        int [] nums = {1, 3, 2, 1};
        System.out.println(Arrays.toString(getConcatenation(nums)));
        
    }

    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];
        for(int i=0; i < n; i++) {
            ans[i] = nums[i];  // nums[0] = ans[0] ---> 1 = 1
            ans[i + n] = nums[i];// nums[0] = ans[0 + 3] --> 1 = 1 at 3rd index of an array
        }
        return ans;
        
    }
    
}
