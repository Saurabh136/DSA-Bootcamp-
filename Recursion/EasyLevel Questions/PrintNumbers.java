public class PrintNumbers {
        public static void main(String[] args) {
           // fun(5);
            funBoth(5);
        }
        static void fun(int n) {
            if(n==0) {
                return;
            }
            // this will print 5,4,3,2,1
            System.out.println(n);
            fun(n-1);
        }
        static void funRev(int n) {
            if(n==0) {
                return ;
            }
            //this will reverse the sequence i.e 1,2,3,4,5
            funRev(n-1); // here it will first call all function in the stack and then it will print all that
            System.out.println(n); // now as it is store in stack then the last function will be printed first
                                    // so the sequence will be 1,2,3,4,5

        }
        static void funBoth(int n) {
            if(n==0) {
                return;
            }
            // this will print 5,4,3,2,1
            System.out.println(n);
            funBoth(n-1);
            System.out.println(n);
        }
}
