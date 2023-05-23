public class DigitSum {
    public static void main(String[] args) {
        int ans = sum(1342);     // i.e 1+3+4+2 = 10
        System.out.println(ans);
    }

    static int sum(int n) {
        if(n == 0) {
            return 0;
        }
        return (n%10) + sum(n/10); // 1st iteration will be 2 + sum(134) 2nd iteration will be 4 +sum(13) and following 
    }
}
 //here n%10 will give reminder of the number 1342 i.e 2 and n/10 will give 134
 //similarly the recurssion tree will work untill we get sum of the given digit 
 //i.e in 2nd iteration it will be 134%10 = 4 and 134/10 = 13 , then again 13%10 = 3 and 13/10=1
 // So n%10 will give 2+4+3+1 and n/10 will give the remaining number less the last digit
