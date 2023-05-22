//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
public class NumberOfStepsToZero {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
        
    }
    public static int numberOfSteps(int num) {
        return helper(num,0);
        
    }
    private static int helper(int num, int steps) {
        if(num==0) {
            return steps;
        }
        if(num % 2 == 0) {
            return helper(num/2,steps + 1); //if number is even
        }
        return helper(num-1, steps + 1);  // if number is odd
    }
}
