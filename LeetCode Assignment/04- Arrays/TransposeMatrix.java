import java.util.Arrays;

//https://leetcode.com/problems/transpose-matrix/
public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},
                          {4,5,6},
                          {7,8,9}};
        //int[][] transposed = transpose(matrix);
        //System.out.println(Arrays.deepToString(transposed));
        System.out.println(Arrays.deepToString(transpose(matrix)));
        
    }
    public static int[][] transpose(int[][] matrix) {
        int m = matrix.length;  // no. of rows
        int n = matrix[0].length; // no. of columns
        int[][] ans = new int[n][m]; // 2D integer array with m and n dimensions
        for(int i = 0; i < m; i++) {    // Iterates rows
            for(int j = 0; j < n; j++) {  // Iterates columns
                ans[j][i] = matrix[i][j];  
                // Since the rows and columns are swapped in the transposed matrix, 
                //the row index i in the input matrix corresponds to the column index in the transposed matrix, 
                //while the column index j in the input matrix corresponds to the row index in the transposed matrix. 
                //Thus, the function assigns matrix[i][j] to ans[j][i].
            }
        }
        return ans;
    }
}
