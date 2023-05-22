import java.util.Scanner;

//Take name as input and print a greeting message for that particular name.
public class Greeting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = in.next();
        System.out.print(" Welcome To Old Trafford " + name);
    }
}
