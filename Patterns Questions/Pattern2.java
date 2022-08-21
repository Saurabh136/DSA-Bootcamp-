public class Pattern2 {
    public static void main(String[] args) {
        pattern(1);
        System.out.println();

    }
    static void pattern(int n) {
        for(int i = 5; i>= n; i--) {
            for(int j=1; j<=i; j++) {
                System.out.print( i + " ");

            }
            System.out.println();
        }
    }
}