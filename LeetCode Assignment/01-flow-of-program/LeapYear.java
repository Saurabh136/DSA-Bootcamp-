import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Year:  ");
        int y = in.nextInt();
        if( y % 4 == 0) {
            System.out.println("It is a Leap year");
        } else {
            System.out.println("It is not a leap year");
        }
        
    }
}
