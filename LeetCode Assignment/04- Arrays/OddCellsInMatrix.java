//https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/description/
//Time : O(i x(m+n))
//space: O(mxn)
public class OddCellsInMatrix {
    public static void main(String[] args) {
        int m = 2; 
        int n = 3; 
        int[][]indices = {{0,1},{1,1}};
        System.out.println(oddCells(m,n,indices));
        
    }

    //brutForce Approach
    // public static int oddCells(int m, int n, int[][] indices) {
    //     int[][] ans = new int[m][n]; //new matrix of size mxn
    //     for(int i=0; i < indices.length; i++) {
    //         // row is constant and Columns are change in below loop
    //         for(int j=0; j < n; j++) {
    //             ans[indices[i][0]][j]++; // updating jth element of indices i at 0;
    //         }
    //         // column is constant and row are change in below loop
    //         for(int j=0; j < m; j++) {
    //             ans[j][indices[i][1]]++; // updating jth element of indices i at 1;
    //         }
    //     }
    //     int count = 0;
    //     for(int i=0; i < m; i++){
    //         for(int j=0; j < n; j++){
    //             if(ans[i][j] % 2 != 0){
    //                 count++;
    //             }
    //         }
    //     }
    //     return count;
    // }
    //optimize approach
    public static int oddCells(int m, int n, int[][] indices) {
        int[] rowCounts = new int[m];
        int[] colCounts = new int[n];
        
        for(int[] index : indices){
            rowCounts[index[0]]++;
            colCounts[index[1]]++;
        }
        
        int oddCount = 0;
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if((rowCounts[i] + colCounts[j]) % 2 != 0){
                    oddCount++;
                }
            }
        }
        return oddCount;
    }
}

//Note : This code maintains two arrays, rowCounts and colCounts, 
//to keep track of the number of times each row and column is updated. 
//It then iterates through each element of the matrix and checks if the sum of the count of row updates 
//and the count of column updates for that element is odd. If it is, it increments the oddCount variable.
//This optimized approach has a time complexity of O(m+k+n), 
//which is much more efficient than the previous approach for larger matrices and a larger number of indices. 
//The space complexity of this approach is O(m+n), which is the space required to store the two arrays.
