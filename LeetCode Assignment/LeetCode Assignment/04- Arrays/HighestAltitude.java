//https://leetcode.com/problems/find-the-highest-altitude/
//Time comp: O(n)
//Space comp: O(1)
public class HighestAltitude {
    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
        System.out.println(highestAltitude(gain));
    }

    public static int highestAltitude(int[]gain) {
        int max = 0;
        int current = 0;
        for(int i = 0; i < gain.length; i++) {
            current += gain[i];  //current = -5 + -5 = -10 , -10 + 1 = -9, -9 + 5 = -4, -4 + 0= -4, -4 + -7 =-11
            max = Math.max(current, max); // whichever value is greater between current and max add it to max variable
        }
        return max; // we will get the maximum value
    }
}
