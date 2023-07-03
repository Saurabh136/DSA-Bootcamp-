public class ProductSum {
    public static void main(String[] args) {
        int ans = product(35);
        System.out.println(ans);
    }
    static int product(int n) {
        if(n%10 == n) {   // if one digit is remaining return that digit
            return n;
        }
        return (n%10) * product(n/10); //here 1st iteration will give 5 * product(3)
    }
    
}
