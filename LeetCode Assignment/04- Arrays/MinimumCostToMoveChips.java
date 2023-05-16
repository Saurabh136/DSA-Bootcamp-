//Leetcode 1217: https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position/
//Time : The time complexity of the given code is O(n), where n is the length of the position array. 
//Space: The space complexity of the code is O(1) because we are using a constant amount of additional space. 
//We only need a few variables (evenCount, oddCount, and chip) to keep track of the counts and the current chip position. 
//The space used does not depend on the input size.
public class MinimumCostToMoveChips {
    public static void main(String[] args) {
        int[] position = {2,2,2,3,3};
        System.out.println(minCostToMoveChips(position));
        
    }

    public static int minCostToMoveChips(int[] position) {
        int evenCount = 0;
        int oddCount = 0;

        //count the number of chips on odd and even positions
        for(int chip : position) {
            if(chip % 2 == 0) {
                evenCount++;
            }else {
                oddCount++;
            }
        }
        //return the minimum cost, which is the smaller count between odd and even chips
        return Math.min(evenCount, oddCount);
    }
}
