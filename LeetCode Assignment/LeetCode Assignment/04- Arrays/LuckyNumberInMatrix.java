//https://leetcode.com/problems/lucky-numbers-in-a-matrix/
import java.util.ArrayList;
import java.util.List;

public class LuckyNumberInMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{3,7,8},{9,11,13},{15,16,17}};
        System.out.println(luckyNumber(matrix));
        
    }
    // Define the luckyNumber method that takes a 2D integer array as the argument and returns a list of integers
    public static List<Integer> luckyNumber(int[][] matrix) {
        // Initialize a list to hold the lucky numbers
        List<Integer> arr = new ArrayList<>();
        // Iterate over each row in the matrix
        for(int i = 0; i < matrix.length; i++) {
            // Initialize variables to hold the minimum value and index for the current row
            int minIndx = 0;
            int min = 99999;
            // Iterate over each column in the current row to find the minimum value and its index
            for(int j =0; j < matrix[i].length; j++) {
                if(matrix[i][j] < min) {
                    min = matrix[i][j];
                    minIndx = j;
                }
            }
            // Initialize a boolean flag to keep track of whether the minimum value is the maximum in its column
            boolean isTrue = true;
            // Iterate over each row in the matrix to check if the minimum value is the maximum in its column
            for(int j =0; j < matrix.length; j++) {
                if(matrix[i][minIndx] < matrix[j][minIndx]) {
                    isTrue = false;
                    break;
                }
            }
            // If the minimum value is the maximum in its column, add it to the list of lucky numbers
            if(isTrue) {
                arr.add(matrix[i][minIndx]);
            }
        }
         // Return the list of lucky numbers
        return arr;
    }
}
