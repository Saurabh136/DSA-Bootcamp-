//https://leetcode.com/problems/matrix-diagonal-sum/
//Time: O(n) where n is the number of rows and columns in the matrix
//Space: O(1) as we only use a constant amount of extra space to store the sum and the matrix dimensions.
public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},
                       {4,5,6},
                       {7,8,9}};
        System.out.println(diagonalSum(mat));      
    }

    public static int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length; // n represents the number of rows & cols in the matrix
        for(int i =0; i < n; i++) {
            sum += (mat[i][i] + mat[i][n - i - 1]); //main diagonal element - element at the opposite end of the secondary diagonal
        }
        if(n % 2 == 0) {
            return sum;
        }else {
            return sum - mat[n/2][n/2]; //  If n is odd, then the code subtracts the element at the middle index (i.e., mat[n/2][n/2]) once from the sum. 
        }
    }
}
