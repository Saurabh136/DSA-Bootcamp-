

//https://leetcode.com/problems/find-smallest-letter-greater-than-target/

public class SmallestLetter {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 'a';
        char ans = nextGreatestLetter(letters, target);
        System.out.print(ans);
        
    }
    // return the index of smallest no. >= target;
    static char nextGreatestLetter(char[] letters, char target) {

    
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            // find the middle element
            int mid = start + (end - start) /2;
            
            if(target < letters[mid]) {
                    end = mid -1;
                } else {
                    start = mid + 1;  //now the target will be at the right side
                } 
            
            }
            return letters[start % letters.length];
    }
}    
    

