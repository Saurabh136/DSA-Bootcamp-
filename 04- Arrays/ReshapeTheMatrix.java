//https://leetcode.com/problems/reshape-the-matrix/submissions/943984267/
//The time complexity of this solution is O(m * n), 
//where m and n are the number of rows and columns in the original matrix. 
//This is because we need to iterate over all elements in the original matrix in order to copy them into the new matrix.
//The space complexity of this solution is O(r * c),
// where r and c are the desired number of rows and columns in the reshaped matrix. 
//This is because we need to create a new matrix with the desired shape to hold the reshaped elements of the original matrix.

import java.util.Arrays;

public class ReshapeTheMatrix {
    public static void main(String[] args) {
        int[][] mat = {{1,2},{3,4}}; 
        int r = 1; 
        int c = 4;
        System.out.println(Arrays.deepToString(matrixReshape(mat, r, c)));
        
    }
    
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length; //number of rows in the original matrix
        int n = mat[0].length; //number of columns in the original matrix

        //check if the reshape operation is possible and legal
        if(m * n != r * c) {
            return mat; //return the original matrix if reshape is not possible
        }

        int[][] reshapedMat = new int[r][c]; //create a new matrix with the desired shape
        
        //copy the elements of the original matrix into the new matrix in row traversing order
        for(int i =0; i < r * c; i++){
            reshapedMat[i/c][i%c] = mat[i/n][i%n];
        }
        return reshapedMat; 

    }
    
}
