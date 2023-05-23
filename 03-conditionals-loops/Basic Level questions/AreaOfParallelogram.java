import java.util.Scanner;

public class AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Base of a Parallelogram: ");
        double b = in.nextDouble();
        System.out.println("Height of a Parallelogram: ");
        double h = in.nextDouble();
        double ar = area(b, h);
        System.out.println("Area of Parallelogram is: "+String.format("%.2f",ar));
    }
    static double area(double base,double height) {
        return base*height;
    }
}
