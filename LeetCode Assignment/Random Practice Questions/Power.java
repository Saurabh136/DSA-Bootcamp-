class Power {
    public static void main(String[] args) {

        int base = 3, exponent=4;
        long result = 1;

       /* In this program, base and exponent are assigned values 3 and 4 respectively.

       Using the while loop, we keep on multiplying the result by base until the exponent becomes zero.*/

        while (exponent != 0) {
            result *= base;
            --exponent;
        }
        
        System.out.println("Answer = " + result);
    }
}