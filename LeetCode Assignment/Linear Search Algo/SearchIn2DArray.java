import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {21, 22, 25},
            {18,12,6,80,32},
            {20,31,41,22},
            {10,17}
        };
        int target = 41;
        int[] ans = search(arr,target); // format of return value(row,col)

        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
        
    }

    static int[] search(int[][] arr,int target) {
        for(int row=0; row < arr.length; row ++) {
            for(int col=0; col < arr[row].length; col++) {
                if(arr[row][col]== target) {
                    return new int[]{row,col};

                }
            }
        }
        return new int[]{-1,-1};

    
    }
    static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for(int row=0; row < arr.length; row ++) {
            for(int col=0; col < arr[row].length; col++) {
                if(arr[row][col] > max) {
                    max = arr[row][col];

                }
            }
        }
        return max;
    }    

    
}
