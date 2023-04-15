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
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] ans = new int[n][m];
        for(int i = 0; i < m; i++) {    // for rows
            for(int j = 0; j < n; j++) {  // for columns
                ans[j][i] = matrix[i][j];
            }
        }
        return ans;
    }
}
