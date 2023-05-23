import java.util.Arrays;
public class SmallerNumbersThenCurrent {
    public static void main(String[] args) {
        int[] nums = {8, 1, 2, 2, 3};
       System.out.println(Arrays.toString(smallerNumberThenCurrent(nums)));
    }
    // public static int[] smallerNumberThenCurrent1(int[] nums) {
    //     int n = nums.length;
    //     int[] ans = new int[n];
    //     for(int i = 0; i < n; i++) {
    //         int count = 0;
    //         for(int j = 0; j < n; j++) {
    //             if(nums[i] > nums[j] && i != j) {
    //                 count++;
    //             }
    //         }
    //         ans[i] = count;
    //     }
    //     return ans;
    // }

    //optimize solution
    public static int[] smallerNumberThenCurrent(int[] nums) {
        int[] res = new int[nums.length];//new array to store result
        int[] temp = new int[101]; //temporary array
        //store frequency
        for(int i = 0; i < nums.length; i++) {
            temp[nums[i]]++;
        }
        //running sum
        for(int i = 1; i < 101; i++) {
            temp[i] += temp[i-1];
        }
        //storing ans
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                res[i] = 0;
            }else {
                res[i] = temp[nums[i] - 1];
            }
        }
        return res;

    }
}
