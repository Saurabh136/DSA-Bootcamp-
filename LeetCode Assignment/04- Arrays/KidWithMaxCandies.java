import java.util.ArrayList;
import java.util.List;

public class KidWithMaxCandies {
    public static void main(String[] args) {
        int [] candies = {2,3,5,1,3};
        int extracandies = 3;
        System.out.println(maxCandies(candies,extracandies));
    }
    public static List<Boolean> maxCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>(candies.length); //new list of the size of candies
        int maxi = -999999999; //intial value
        for(int i = 0; i < candies.length; i++) {
            maxi = Math.max(maxi,candies[i]);  // whichever is maximum element in between maxi and candies[i] it will get stored in maxi
        }
        for(int i : candies) {  //for each loop for iterating candies
            ans.add(i >= maxi - extraCandies); // if i is greater then maxi - extracandies then append true or else false.
        }
        return ans;
    }
}
