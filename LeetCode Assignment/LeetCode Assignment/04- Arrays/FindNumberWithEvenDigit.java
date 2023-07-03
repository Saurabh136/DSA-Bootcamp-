//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
// Time comp: O(K)  where K is the number of digits in the element.
// Space comp: O(1) as it only uses a constant amount of extra space to store the ans and digit variables. The input array nums is not modified and does not contribute to the space complexity.

public class FindNumberWithEvenDigit {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }

    public static int findNumbers(int[] nums) {
        int ans = 0;
        for(int i = 0; i < nums.length; i++) {
            int digit = (int) Math.log10(nums[i]) + 1; // it counts the number of digit in each element
            if(digit % 2 == 0) {  // if the count is even then it is added to the ans variable
                ans++;
            }
        }
        return ans;
    }
}
