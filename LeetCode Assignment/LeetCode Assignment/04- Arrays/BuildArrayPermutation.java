import java.util.Arrays;

//https://leetcode.com/problems/build-array-from-permutation/description/
//1920. Build Array from Permutation

// logic: input:  nums = [0, 2, 1, 5, 3, 4]
//         output:  ans = []

//          ans[i] = nums[nums[i]]
//          At ans[0] = nums[nums[0]] --> ans = [0] // here on 0th index there is 0
//          At ans[1] = nums[nums[2]] --> ans = [0, 1] // here nums at index 2 is 1 so answer at index 1 is 1
//          At ans[2] = nums[nums[1]] --> ans = [0, 1, 2] // here value at index 2 is 1 so output at index 1 is 2 in the array.
//          At ans[3] = nums[nums[5]] --> ans = [0, 1, 2, 4] // value at index 5 in the input array is 4
//          At ans[4] = nums[nums[3]] --> ans = [0,1,2,4,5] // value at index 3 is 5
//          At ans [5] = nums[nums[4]] --> ans = [0,1,2,4,5,3] // value at index 4 is 3

// ---- Brut Force Approach--
// - arr = ans[size of nums];
// - for(int i =0; i< size of nums; i++){
//     ans[i] = nums[nums[i]]
// }
// return ans;
// - Time complexity--- is Size of nums --  O(n) - coz  it will run from 0 to n
// - Space complexity- extra array of name ans so it will be "Omega of n O(n)"
// - Logic for Space complexity for Omega of 1 O(1).
//     n = size of nums[];
//     [0,2,1,5,3,4]

//     nums[i] = n * [nums[nums[i]] % n] + nums[i] // n=6 i.e the size of a array
//  so nums[0] = 6 * 0 + 0 -- op -> [0]
//     nums[1] = 6 * 1 + 2 -- op -> [0,8] // nums[nums[1]] gives nums[2] --> 1 is the value at index 2 in array nums[1] = 2
//     nums[2] = 6 * 2 + 1 -- op -> [0,8,13] // nums[nums[2]] = nums[1] = 2 is the value at index 1 in array
//     nums[3] = 6 * 4 + 5 -- op -> [0,8,13,29] // nums[nums[3]] = nums[5] = 4
//     nums[4] = 6 * 5 + 3 -- op ->[0,8,13,29,33] // nums[nums[4]] = nums[3] = 5
//     nums[5] = 6 * 3 + 4 -- op -> [0,8,13,29,33,22] // nums[nums[5] = nums[4] = 3
//     So when we do a modulo of each value of the output array we get our expected answer e.g 8%6= 1 , 13%6= 2, 29%6= 4, 33%6 = 5, 22%6= 3
//     Time = O(n)
//     Space = Omega(n)

//     ---- Brut Force Approach--

//     nums[i] = n * (nums[nums[i]]%n) + n[i];
//     for(int i =0; i < n; i++) {
//         nums[i] = nums[i]/n;
//     }

// with Space Complexity of Omega(n)
    public class BuildArrayPermutation {
        public static void main(String[] args) {
            int nums [] = {0, 2, 1, 5, 3, 4};
            System.out.println(Arrays.toString(buildArray(nums)));
            System.out.println(Arrays.toString(buildArray1(nums)));
        }
    public static int[] buildArray(int[] nums) {
        int[] ans = new int [nums.length]; // created a new array with same length as nums

        for(int i = 0; i < ans.length; i++) { 
            ans[i] = nums[nums[i]];
        }
        return ans;
        
    }
 //with space complexity of Omega(1) , here we dont create a new array rather we use the existing array
 public static int[] buildArray1(int[] nums) {
    int n = nums.length;

    for(int i = 0; i < n; i++) {
        nums[i] = n * (nums[nums[i]] % n) + nums[i];
    }

    for(int i = 0; i < n; i++) {
        nums[i] = nums[i] / n;
    }
    return nums;
    
}   
}


