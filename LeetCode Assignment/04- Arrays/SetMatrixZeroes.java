//Leetcode73(Medium):- https://leetcode.com/problems/set-matrix-zeroes/description/
//Time complexity: O(m * n)
//Here, 'm' represents the number of rows in the matrix, and 'n' represents the number of columns.
//The nested loops used to traverse the matrix contribute to a time complexity of O(m * n).
//The additional loops used to update the first row and first column also have a linear time complexity, but they are dominated by the previous nested loops.
/*Space Complexity: O(1)

The code uses a constant amount of extra space regardless of the size of the input matrix.
The boolean variables firstRow and firstCol require constant space.
There are no additional data structures used that grow with the input size.
Thus, the space complexity is O(1), indicating constant space usage. */
public class SetMatrixZeroes {
    public static void main(String[] args) {
        int[][] matrix = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};

        SetMatrixZeroes setMatrixZeroes = new SetMatrixZeroes();
        setMatrixZeroes.setZeroes(matrix);

        // Print the updated matrix
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public void setZeroes(int[][] matrix) {
        boolean firstRow = false;
        boolean firstCol = false;

        // Set markers in the first row and first column
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    if (i == 0)
                        firstRow = true; // Mark the first row if it contains zero
                    if (j == 0)
                        firstCol = true; // Mark the first column if it contains zero
                    matrix[0][j] = 0; // Mark the column by setting the first cell to zero
                    matrix[i][0] = 0; // Mark the row by setting the first cell to zero
                }
            }
        }

        // Replace inner matrix elements
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0; // Set the cell to zero if its row or column marker is zero
                }
            }
        }

        // Update first row if necessary
        if (firstRow) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[0][j] = 0; // Set the first row to zero
            }
        }

        // Update first column if necessary
        if (firstCol) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0; // Set the first column to zero
            }
        }
    }
}
