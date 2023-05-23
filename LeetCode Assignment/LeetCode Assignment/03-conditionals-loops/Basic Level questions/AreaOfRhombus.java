import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Diagonal 1 of a rhombus: ");
        double d1 = in.nextDouble();
        System.out.println("Diagonal 2 of a rhombus: ");
        double d2 = in.nextDouble();
        double ar = area(d1, d2);
        System.out.println("Area of Rhombus is: "+String.format("%.2f",ar));
    }
    static double area(double diagonal1,double diagonal2) {
        return (diagonal1 * diagonal2)/2;
    }
}
