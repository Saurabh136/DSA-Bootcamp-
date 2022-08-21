public class Shadowing {
    static int x= 90;    // here x=90 was shadowed by x=40
    public static void main(String[] args) {
        System.out.println(x);
        int x= 40; // the class variable at line 2 is shadowed by this
        System.out.println(x);
        fun();
    }

    static void fun() {
        System.out.println(x); // as the value x=40 is limited to the scope here the value of x will be printed as x=90
    }
    
}
