
import java.util.ArrayList;


public class Permutations {

    public static void main(String[] args) {
       // permutations("", "abc");

    //    ArrayList<String> ans = permutationsList("", "OUT");
    //    System.out.println(ans);

    System.out.println(permutationsCount("", "abc"));

        
    }

    static void permutations(String processed, String unprocessed) {
        if(unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0); // first character

        for(int i = 0; i <= processed.length(); i++) {
            String first = processed.substring(0, i);
            String second = processed.substring(i, processed.length());
            permutations(first + ch + second,unprocessed.substring(1));

        }
    }

    static ArrayList<String> permutationsList(String processed, String unprocessed) {
        if(unprocessed.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        char ch = unprocessed.charAt(0); // first character

        ArrayList<String> ans = new ArrayList<>();

        for(int i = 0; i <= processed.length(); i++) {
            String first = processed.substring(0, i);
            String second = processed.substring(i, processed.length());
            ans.addAll(permutationsList(first + ch + second,unprocessed.substring(1)));

        }

        return ans;
    }

     static int permutationsCount(String processed, String unprocessed) {
        if(unprocessed.isEmpty()) {
            return 1;
        }
        int count = 0;
        char ch = unprocessed.charAt(0); // first character

        for(int i = 0; i <= processed.length(); i++) {
            String first = processed.substring(0, i);
            String second = processed.substring(i, processed.length());
            count = count + permutationsCount(first + ch + second,unprocessed.substring(1));
        }
        return count;
    }
    
}
