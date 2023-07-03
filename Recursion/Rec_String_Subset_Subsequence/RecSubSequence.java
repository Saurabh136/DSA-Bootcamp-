import java.util.ArrayList;

public class RecSubSequence {
    public static void main(String[] args) {
        subseq("","abcd");
        System.out.println(subseqReturn("","abc"));
        subseqAscii("","abcd");
        System.out.println(subseqAsciiReturn("", "abc"));
        
    }
    //SubSequence
    static void subseq(String process , String unprocess) {
        if(unprocess.isEmpty()) {    // base condition
            System.out.println(process);
            return;
        }

        char ch = unprocess.charAt(0); // first character

        subseq(process + ch, unprocess.substring(1));  // take the character
        subseq(process, unprocess.substring(1)); // ignore the character

    }
     //Return an Array List of String
    static ArrayList<String> subseqReturn(String process , String unprocess) {
        if(unprocess.isEmpty()) {    // base condition
            ArrayList<String> list = new ArrayList<>();
            list.add(process);
            return list;
        }

        char ch = unprocess.charAt(0); // first character

       ArrayList<String> left = subseqReturn(process + ch, unprocess.substring(1));  // take the character
       ArrayList<String> right = subseqReturn(process, unprocess.substring(1)); // ignore the character

       left.addAll(right);
       return left;
    }
    // Print Ascii value of characters
     static void subseqAscii(String process , String unprocess) {
        if(unprocess.isEmpty()) {    // base condition
            System.out.println(process);
            return;
        }

        char ch = unprocess.charAt(0); // first character

        subseqAscii(process + ch, unprocess.substring(1));  // take the character
        subseqAscii(process, unprocess.substring(1)); // ignore the character
        subseqAscii(process + (ch + 0), unprocess.substring(1));

    }
    // return an Arraylist of Ascii values of the charaters
    static ArrayList<String> subseqAsciiReturn(String process , String unprocess) {
        if(unprocess.isEmpty()) {    // base condition
            ArrayList<String> list = new ArrayList<>();
            list.add(process);
            return list;
        }

        char ch = unprocess.charAt(0); // first character

       ArrayList<String> first = subseqAsciiReturn(process + ch, unprocess.substring(1));  // take the character
       ArrayList<String> second = subseqAsciiReturn(process, unprocess.substring(1)); // ignore the character
       ArrayList<String> third = subseqAsciiReturn(process + (ch + 0), unprocess.substring(1)); // gives Ascii value of character

       first.addAll(second);
       first.addAll(third);
       return first; // so first contains all the answers
    }   
    
}
