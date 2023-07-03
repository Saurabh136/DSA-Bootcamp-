import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double radius = in.nextInt();
        AreaOfCircle ar = new AreaOfCircle();
        double area = ar.areaOfcircle(radius);
        System.out.println("Area of the circle: " + String.format("%.2f", area));
    }
    private double areaOfcircle(double radius) {
        double pi = Math.PI;
        return pi * radius * radius;
        
    }
}