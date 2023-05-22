//https://leetcode.com/problems/add-to-array-form-of-integer/description/
import java.util.*;

public class AddToArrayForm {
    public static void main(String[] args) {
        int[] num = {1,2,0,0}; 
        int k = 34;
        System.out.println(addToArrayForm(num, k));
        
    }
    public static List<Integer> addToArrayForm(int[] num, int k) {
        int n = num.length; // length of num
        int i = n - 1;
        List<Integer> solution = new ArrayList<>(); // new ArrayList of Integer object name solution
        while (i >= 0 || k > 0) {  //loop runs as long as either i is greater then equal to 0 or k is greater then 0
            if(i >= 0) { // if i is greater then zero then
                solution.add((num[i] + k)%10); //add the answer to solution list e.g ((0 + 34)%10) = 4
                k = (num[i] + k)/ 10; // set k to (num[i] + k)/ 10 e.g ((0 + 34)/10) = 3, so after 1st iteration k value will be 3
            }else {
                solution.add(k % 10); // if i is less then zero then k % 10 is added to the solution list
                k /= 10; // And k is divided by 10
            }
            i--; // i is decremented after every iteration
        }
        Collections.reverse(solution);  // it reverse the elements in the solution list
        return solution; //This line returns the solution list to the calling method
    }
}