//https://leetcode.com/problems/check-if-the-sentence-is-pangram/
public class CheckIfPangram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));  
        
    }
    public static boolean checkIfPangram(String sentence) {
        boolean[] arr = new boolean[26];  // new boolean array of size 26
        for(int i = 0; i < sentence.length(); i++) {
            arr[sentence.charAt(i) - 97] = true; // here it will autocast the ASCII value of the alphabet and then it will be subtracted with 97(ASCII value of 'a') the answer of it is the index value of that alphabet
        }
        for(int i = 0; i < 26; i++) {
            if(arr[i] == false) {
              return false;
            }
        }
        return true;
    }
}