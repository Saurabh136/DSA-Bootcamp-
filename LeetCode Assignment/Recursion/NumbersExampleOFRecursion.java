public class NumbersExampleOFRecursion {
    public static void main(String[] args) {
        print(1);
    }
    static void print(int n) {
        if(n==5) {                   // this is the base condition
            System.out.println(5);  // every function call will have its own separate memory
            return;
        }
        System.out.println(n);
        //recursive call
        //if you are calling a function again and again, you can treat it as a separate call in the stack
        //this is called tail recursion
        // this is the last function call
        print(n+1);
    }
}