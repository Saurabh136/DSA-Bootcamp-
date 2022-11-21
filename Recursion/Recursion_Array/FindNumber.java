import java.util.ArrayList;

public class FindNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,1,4,4,5};
        System.out.println(find(arr, 4, 0));
        System.out.println(findIndex(arr, 4, 0));
        System.out.println(findIndexFromLast(arr, 4, arr.length -1));
        // findAllIndex(arr, 4, 0);
        // System.out.println(list);
        ArrayList<Integer> ans = findAllIndex(arr, 4, 0, new ArrayList<>());
        System.out.println(ans);

        System.out.println(findAllIndex2(arr, 4, 0));
    }
    //function to check wheather the element exist in an given array
    static boolean find(int[] arr,int target, int index) {
        if(index == arr.length) {  //false condition that element doesn't exist
            return false;
        }
        return arr[index] == target || find(arr, target, index + 1); // return if element is found or move to next index in an array
    }
    //return index number of target element
    static int findIndex(int[] arr,int target, int index) {
        if(index == arr.length) {  //false condition that element doesn't exist
            return -1;
        }
        if(arr[index] == target){
            return index;
        }else {
            return findIndex(arr, target, index + 1); 
        }
    } 
    // find index of target element from last in reverse order
    static int findIndexFromLast(int[] arr,int target, int index) {
        if(index == -1) {  //false condition that element doesn't exist
            return -1;
        }
        if(arr[index] == target){
            return index;
        }else {
            return findIndexFromLast(arr, target, index - 1); 
        }
    }
    // find all index for repeated element in an array
    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr,int target, int index) {
        if(index == arr.length) {
            return;
        }
        if(arr[index] == target) {
            list.add(index);    // Dont return answer , just add it in the list
        }
        findAllIndex(arr, target, index + 1);
    }

    // return an Array list
    static ArrayList<Integer> findAllIndex(int[] arr,int target, int index,ArrayList<Integer> list) {
        if(index == arr.length) {
            return list;  
        }
        if(arr[index] == target) {
            list.add(index);    // Dont return answer , just add it in the list
        }
        return findAllIndex(arr, target, index + 1, list); //this will return the whole list again
    }
    // return the list without passing the argument
    static ArrayList<Integer> findAllIndex2(int[] arr,int target, int index) {
        
        ArrayList<Integer> list = new ArrayList<>();  //creating a new array list at every point
        
        if(index == arr.length) {
            return list;  
        }
        //this will contain answer for that function call only
        if(arr[index] == target) {
            list.add(index);    // Dont return answer , just add it in the list
        }
        ArrayList<Integer> ansForBelowCalls = findAllIndex2(arr, target, index + 1); //this will return the whole list again

        list.addAll(ansForBelowCalls); //this list will contain all the answers till now collectively

        return list;
    }         
}
