public class BinarySearchSQRT {
    public static void main(String[] args) {
        int n = 40;
        int precision = 3;

       // System.out.println(sqrt(n,precision));
        System.out.printf("%.3f", sqrt(n, precision));
    }
    // Time Complexity : O(log(n))
    static double sqrt(int n, int precision) {
        int start = 0;
        int end = n;

        double root = 0.0;
        

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(mid * mid == n) {  //perfect square
                root = mid;
                return mid;
            }
            if(mid * mid > n) {
                end = mid - 1;
            }else {
                start = mid + 1;
            }
            double incr = 0.1;
            for(int i=0; i < precision; i++) {
                while(root * root <= n) {
                    root += incr;
                }
                root -= incr;  // for 2nd decimal place
                incr /= 10;
            }

        }
        return root;
    }
    
}
