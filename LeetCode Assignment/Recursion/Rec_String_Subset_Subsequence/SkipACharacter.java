public class SkipACharacter {
    public static void main(String[] args) {
        skip("","baccdah"); //initially process will be empty & from unprocess all the 'a' will be removed
        System.out.println(skip("bccaadhh")); // entire value will contain string in itself
    }

    static void skip (String process, String unprocess) {
        if(unprocess.isEmpty()) {    //if unprocess is empty then print my process and return
            System.out.println(process);
            return;
        }

        char ch = unprocess.charAt(0); // first character of every function call

        if(ch == 'a') {       //if character is equal to 'a' then skip it 
            skip(process, unprocess.substring(1)); // process will remain as it is and the substring unprocess will remove the first character.
        }else {
            skip(process + ch, unprocess.substring(1)); //otherwise add that character in the process.
        }
    }
    // similar but only difference is it is  returning the string
    static String skip(String unprocess) {
        if(unprocess.isEmpty()) {
            return "";
        }

        char ch = unprocess.charAt(0);

        if(ch == 'a') {
            return skip(unprocess.substring(1));
        }else {
            return ch + skip(unprocess.substring(1)); //when not equal to 'a' add current answer plus whatever the recursion value we get
        }
    }
}