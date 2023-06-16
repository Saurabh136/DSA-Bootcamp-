import java.util.Arrays;

public class SpiralMatrixIII {
    public static void main(String[] args) {
        int rows = 1; 
        int cols = 4; 
        int rStart = 0; 
        int cStart = 0;

        System.out.println(Arrays.deepToString(spiralMatrixIII(rows, cols, rStart, cStart)));
        
    }

    public static int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        //create a 2D array to store the result
        int[][] result = new int[rows * cols][2];

        //define the 4 possible directions : East , south ,west,north
        int[][] directions = {{0,1}, {1,0}, {0, -1}, {-1,0}};

        //Number cell visited
        int count = 0;

        //number of steps in the current directions
        int step = 1;

        //index of the current direction
        int directionIndex = 0;

        //starting positions
        int row = rStart;
        int col = cStart;

        //Loop untill all cells are visited
        while(count < rows * cols) {
            for (int i = 0; i < step; i++) {
             //if the current position is within the grid boundaries
             if(row >= 0 && row < rows && col >= 0 && col < cols) {
                // Store the coordinates in the result array
                result[count] = new int[]{row,col};
                count++; // Increment the count of visited cells
             }
            // Update the row and column based on the current direction and step count
            row += directions[directionIndex][0];
            col += directions[directionIndex][1];
            }

            directionIndex = (directionIndex + 1) % 4;
            
            if (directionIndex % 2 == 0) {
                step++;
            }
           
        }

        // Return the result array
        return result;
    }
}
    

