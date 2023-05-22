import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountMatchingARule {
    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>();
        items.add(Arrays.asList("phone", "blue", "pixel"));
        items.add(Arrays.asList("computer", "silver", "lenovo"));
        items.add(Arrays.asList("phone", "gold", "iphone"));
        
        CountMatchingARule solution = new CountMatchingARule();
        
        String ruleKey = "color";
        String ruleValue = "silver";
        
        int count = solution.countMatches(items, ruleKey, ruleValue);
        
        System.out.println("Number of items that match the rule: " + count);
        
    }
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int ans = 0; //new variable by name ans
        if(ruleKey.equals("type")) {
            for(int i = 0 ; i < items.size(); i++) { // item.size , coz it is a list
                if(items.get(i).get(0).equals(ruleValue)) { //.get() is use coz it is a list and ruleKey is at 0th index
                    ans++;
                }
            }
        }
        else if (ruleKey.equals("color")) {
            for(int i = 0 ; i < items.size(); i++) { // item.size , coz it is a list
                if(items.get(i).get(1).equals(ruleValue)) { //here will be tracking the 1st index
                    ans++;
                }
            }
        }
        else {
            for(int i = 0 ; i < items.size(); i++) { // item.size , coz it is a list
                if(items.get(i).get(2).equals(ruleValue)) { //here will be tracking the 2nd index
                    ans++;
                }
            }
        }
        return ans;
    }
}
