//Leetcode59(Medium): https://leetcode.com/problems/spiral-matrix-ii/submissions/956020353/
//Time comp: O(n^2), where n is the size of the matrix, the time complexity is proportional to the number of cells, which is O(n^2).
//Space comp: O(n^2), The code uses a 2D matrix of size n x n to store the generated matrix.
//The space required for the matrix is proportional to n^2
//import java.util.Arrays;
public class SpiralMatrixII {
    public static void main(String[] args) {
        SpiralMatrixII generator = new SpiralMatrixII();
        int n = 3;
        //System.out.print(Arrays.deepToString(generateMatrix(n)));
        
        int[][] matrix = generator.generateMatrix(n);

        // Print the generated matrix
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int num = 1; //current number to be filled in the matrix
        int rowBegin = 0;
        int rowEnd = n - 1;
        int colBegin = 0;
        int colEnd = n - 1;

        while (num <= n * n) {
            //traverse right
            for(int col = colBegin; col <= colEnd; col++){
                matrix[rowBegin][col] = num++;
            }
            rowBegin++;

            //traverse down
            for(int row = rowBegin; row <= rowEnd; row++ ){
                matrix[row][colEnd] = num++;
            }
            colEnd--;

            //traverse left
            if(rowBegin <= rowEnd) {
                for(int col = colEnd; col >= colBegin; col--){
                    matrix[rowEnd][col] = num++;
                }
                rowEnd--;
            }

            //traverse top
            if(colBegin <= colEnd) {
                for(int row = rowEnd; row >= rowBegin; row--){
                    matrix[row][colBegin] = num++;
                }
                colBegin++;
            }
        }
        return matrix;
    }
}
