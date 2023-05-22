import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2,3,4,5,6,7,8,9);
        
        multiple( 1,2,,"Saurabh","Cristiano");
    }
    static void fun(int ...num) {                       //variable length arguments
        System.out.println(Arrays.toString(num));
    }

    static void multiple(int , String ...mix) {
        System.out.println(Arrays.toString(a));
    }

}