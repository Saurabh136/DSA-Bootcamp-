import java.util.ArrayList;
import java.util.Scanner;


public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // //syntax
        ArrayList<Integer> list = new ArrayList<>(10);
        // list.add(21);
        // list.add(31);
        // list.add(41);

        // System.out.println(list);

        // //To update the existing list
        // list.set(0,99);
        // System.out.println(list);
        // //to remove an element from the list
        // list.remove(2);
        // System.out.println(list);

        //input
        for(int i =0; i < 5; i++) {
            list.add(in.nextInt());
        }
        //get item at any index
        for(int i=0; i < 5; i++) {
            System.out.println(list.get(2)); //pass index here, list[index] will not work here
        }
        System.out.println(list);

    

    }
    
    
}
