public class ReverseTheValue {
    public static void main(String[] args) {
        
        int num = 235678;
        int ans = 0;

        while (num > 0) {
            int rem = num % 10;  //check last digit i.e 235678 % 10 = 8 ( here 8 is the remainder)
            num /= 10;  // it will remove the last digit 235678 / 10 = 23567

            ans = ans * 10 + rem;
        }
        System.out.println("Reverse of the given number is : " + ans);
    }

    
}
