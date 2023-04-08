public class RecSubSequence {
    public static void main(String[] args) {
        subseq("","abcd");
        
    }

    static void subseq(String process , String unprocess) {
        if(unprocess.isEmpty()) {    // base condition
            System.out.println(process);
            return;
        }

        char ch = unprocess.charAt(0); // first character

        subseq(process + ch, unprocess.substring(1));  // take the character
        subseq(process, unprocess.substring(1)); // ignore the character

    }
    
}
