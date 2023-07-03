public class Concept {
    public static void main(String[] args) {
        concept(5);
        
    }
    static void concept(int n) {
        if(n == 0) {
            return;
        }
        System.out.println(n);
        concept(--n);    
        // So here if we put n-- then it will give a stack overflow error ,
        // but --n will first subtract then print
    }
}
