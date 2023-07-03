

public class FuncOverloading {
    public static void main(String[] args) {
        fun(18);
        fun("Saurabh");                          
    }

     //In function overloading , which function to run first is decided at compile time
     
    static void fun(int a) {
        System.out.println(a);
    }
    static void fun (String d) {
        System.out.println(d);
    }
    
}
