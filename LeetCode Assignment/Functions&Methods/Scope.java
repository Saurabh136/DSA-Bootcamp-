public class Scope {
    public static void main(String[] args) {
        int a =20;
        int b = 10;
    

    //function Scope : variables can be access only inside the given function
    // static void random() {
    //     int num = 26;
    //     System.out.println(num);
    //}

    // block Scope
    {
       // int a = 32; // already initialise outside the box in the same method,hence you cannot initialise it agian
        a=100; // reassign the original reference variable to some other value
        System.out.println(a);
        int c= 99;
        //value initialise in the block will remain in the block
    }
    System.out.println(a);

    // scoping in for loop
    for(int i=0;i<4;i++) {
        System.out.println(i);
                                                    //We can use outside reference variable inside the function
                                                    //But we cannot use a variable which is initialise inside a function ,outside for reference
                                                    //"int a = 10 " here int denotes intialising a new varible
                                                    // while a= 20 here it means updating the value of the reference varible
                                                    //and if the inside varible is initialize again outside the function it will still run
    }
}
    
    
}
