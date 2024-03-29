//Leetcode51(Med):- https://leetcode.com/problems/spiral-matrix/submissions/953836648/
//Time Complex: O(m x n) , coz we traverse through every element
//Space Complex: O(1) , we do not take any more space
import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiralOrder(matrix));
        
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if(matrix.length == 0) {
            return res;
        }

        int rowBegin = 0;
        int rowEnd = matrix.length - 1;
        int colBegin = 0;
        int colEnd = matrix[0].length - 1;

        while(rowBegin <= rowEnd && colBegin <= colEnd) {
            //Traverse Right
            for(int i = colBegin; i <= colEnd; i++) {
                res.add(matrix[rowBegin][i]);
            }
            rowBegin++;

            //Traverse Down
            for(int i = rowBegin; i <= rowEnd; i++) {
                res.add(matrix[i][colEnd]);
            }
            colEnd--;

            //Traverse Left
            if(rowBegin <= rowEnd) {
                for(int i = colEnd; i >= colBegin; i--){
                    res.add(matrix[rowEnd][i]);
                }
            }
            rowEnd--;

            //traverse up
            if(colBegin <= colEnd) {
                for(int i = rowEnd; i >= rowBegin; i--){
                    res.add(matrix[i][colBegin]);
                }
            }
            colBegin ++;
        }
        return res;
    }
}
