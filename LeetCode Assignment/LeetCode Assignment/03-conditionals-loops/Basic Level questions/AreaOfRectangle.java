import java.util.Scanner;
public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Width of a rectangle: ");
        double w = in.nextDouble();
        System.out.println("Height of a rectangle: ");
        double h = in.nextDouble();
        double a = area(w, h);     //using method
        System.out.println("Area of Rectangle is : " + String.format("%.2f", a));
    }
    static double area(double width,double height) {
        return width * height;
    }
}
