public class LargestElement {
    public static void main (String args[]) {
        double[] numArray = {22.5,-30.4,32.4,10.4,-60.4};
        double largest = numArray[0];

        for (double num: numArray) {
            if(largest < num) 
                largest = num;
        }
        System.out.format("largest element= %.2f",largest);
        
    }
}