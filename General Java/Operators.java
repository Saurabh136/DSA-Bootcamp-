import java.util.ArrayList;

public class Operators {
    public static void main(String args[]) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println((char)('a' + 3));

        System.out.println("a" + 2);
        // this is same as after few steps "a" + "2"
        // integer will be converted to Integer that will call toString()

        System.out.println("Saurabh" + new ArrayList<>());
        System.out.println("Saurabh" + new Integer(18));
        String ans = new Integer(18) + "" + new ArrayList<>();
        //As long as there is any object involve , it will print, here that string object was ""
        System.out.println(ans);
    }
}