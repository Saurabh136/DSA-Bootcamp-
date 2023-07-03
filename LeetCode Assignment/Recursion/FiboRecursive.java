public class FiboRecursive {
    public static void main(String[] args) {
        System.out.println(fibo(3));
    }
    static int fibo(int n) {
        //base condition
        if(n < 2) {
            return n;
        }
        
        //recursive relation   
        return fibo(n-1) + fibo(n-2);
    }
}