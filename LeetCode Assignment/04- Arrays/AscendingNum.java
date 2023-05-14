public class AscendingNum {
    public static void main(String[] args) {
        int[] n = {2,3,5,7,8,1,4};
        System.out.println(asceningNum(n));
        
    }

    public static int[] asceningNum(int n) {
        int r,num;
        for(int i = 0; i< 9; i++) {
            num =  n;
            while(num != 0) {
                r = num % 10;
                if(r == i) {
                    return r;
                    num=num/10;

                }
            }
        }
    }
}