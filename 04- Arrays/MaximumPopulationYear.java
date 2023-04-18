//https://leetcode.com/problems/maximum-population-year/submissions/935781094/
public class MaximumPopulationYear {
    public static void main(String[] args) {
        int [][] logs = {{1993,1999},{2000,2010}};
        System.out.println(maximumPopulation(logs));
        
    }

    public static int maximumPopulation(int[][] logs) {
        int arr[] = new int[101]; //integer array arr with a length of 101 to store the population count for each year from 1950 to 2050.
        for(int i = 0; i < logs.length; i++) {
            arr[logs[i][0] - 1950]++; //birth count , it increment the population by 1
            arr[logs[i][1] - 1950]--; //death count , it decrement the population by 1
        }
        //running sum
        //This loop calculates the running sum of the arr array. 
        //It adds the previous value to the current value for each element, 
        //effectively calculating the total population for each year.
        for(int i = 1; i < 101; i++) {
            arr[i] += arr[i - 1];
        }
        //This loop iterates over each element of the arr array and finds the year with the maximum population. 
        //It sets the maxVal variable to the current element if it's larger than the current maximum, 
        //and sets the maxYear variable to the corresponding year (1950 + the index). 
        //It then returns the maxYear variable.
        int maxVal = 0;
        int maxYear = 1950;
        for(int i = 0; i < 101; i++) {
            if(maxVal < arr[i]) {
                maxVal = arr[i];
                maxYear = i + 1950;
            }
        }
        return maxYear;
    }
}