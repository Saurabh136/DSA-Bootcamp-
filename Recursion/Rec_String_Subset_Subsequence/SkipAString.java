public class SkipAString {
    public static void main(String[] args) {
        System.out.println(skipApple("bacanakaapplesaka"));
        System.out.println(skipAppNotApple("bakasakapplenakappdaka"));
        
    }

    static String skipApple(String unprocess) {  //here time complexity is the size of the string
        if(unprocess.isEmpty()) {
            return "";
        }

        if(unprocess.startsWith("apple")) {
            return skipApple(unprocess.substring(5)); //remove the first 5 character
        }else {
            return unprocess.charAt(0) + skipApple(unprocess.substring(1)); //when not equal to 'a' add current answer plus whatever the recursion value we get
        }
    }
    // skip only app not apple from the string
    static String skipAppNotApple(String unprocess) {
        if(unprocess.isEmpty()) {
            return "";
        }

        if(unprocess.startsWith("app") && !unprocess.startsWith("apple")) {  // remove app not apple
            return skipAppNotApple(unprocess.substring(3)); //remove the first 3 character
        }else {
            return unprocess.charAt(0) + skipAppNotApple(unprocess.substring(1)); //when not equal to 'a' add current answer plus whatever the recursion value we get
        }
    }

   
}