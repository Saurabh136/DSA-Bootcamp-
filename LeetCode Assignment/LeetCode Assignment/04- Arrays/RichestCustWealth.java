public class RichestCustWealth {
    public static void main(String[] args) {
        int [][] accounts = {{1,2,3},{3,2,1}};
        System.out.println(maximumwealth(accounts));
    }
    // m --> accounts.length
    // n --> accounts[i].length
    //Time complexity :- O[m * n]
    //Space complexity:- O[1]
    
    public static int maximumwealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for(int person = 0; person < accounts.length; person++) {
             //when we start a new column, take a new sum for that row
            int sum = 0;
            for(int account = 0; account < accounts[person].length; account++){
                sum += accounts[person][account];
            }
            // now we have sum of accounts of person
            // check with overall ans
            ans = Math.max(ans, sum);
        }
        return ans;
    }  
}
