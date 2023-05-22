//Leetcode 1886 - https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/submissions/937578096/
public class EqualMatrixAfterRotation {
    public static void main(String[] args) {
        int[][] mat = {{0, 1}, {1, 0}};
        int[][] target = {{1, 0}, {0, 1}};
        boolean result = findRotation(mat, target);
        System.out.println(result); // expected output: true
        
    }

    public static void rotate(int[][] matrix) {
        //These lines implement a 90-degree clockwise rotation of the input matrix by first transposing it (swapping rows and columns)
        // and then reversing each row. This is done using a nested loop.
        int n = matrix.length;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < i; j++){
            int temp = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = temp;
            }
        }
        //These lines implement the second step of the 90-degree clockwise rotation by reversing each row of the transposed matrix. 
        //This is done using a while loop with two variables "start" and "end" that start from the beginning and end of the matrix, 
        //respectively. In each iteration, the elements at "start" and "end" positions of each row are swapped, and then "start" is incremented while "end" is decremented until they cross over.
        int start = 0;
        int end = matrix.length - 1;
        while(start <= end) {
            for(int row=0; row < matrix.length; row++) {
                int temp = matrix[row][start];
                matrix[row][start] = matrix[row][end];
                matrix[row][end] = temp;
            }    
            start++;
            end--;
        }    
    }
    //These lines compare each element of the "matrix" array with the corresponding element of the "target" array using nested loops. 
    //If any element is found to be different, the method immediately returns false. 
    //If all elements are the same, the method returns true.
    public static boolean check(int[][] matrix, int[][] target) {
        for(int i=0; i < matrix.length; i++) {
            for(int j = 0; j < matrix.length; j++) {
                if(matrix[i][j] != target[i][j]) {
                   return false;
                }
            }
        }
        return true;
    }

    //These lines implement the main logic of the program. 
    //The method "findRotation" rotates the input matrix "mat" by 90 degrees clockwise using the "rotate" method 
    //and checks whether it is equal to the target matrix "target" using the "check" method. 
    //If they are equal, the method returns true. If not, the matrix is rotated again and the check is repeated for a total of 4 rotations (360 degrees). 
    //If none of the rotations match the target matrix, the method returns false.
    public static boolean findRotation(int[][] mat, int[][] target) {
        for(int i =0; i < 4; i++) {
            if(check(mat,target)) {
                return true;
            }
            rotate(mat);
        }
        return false;
    }
}    
