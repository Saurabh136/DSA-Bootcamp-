import java.util.Scanner;
//An isosceles triangle therefore has both two equal sides and two equal angles. 
//The name derives from the Greek iso (same) and skelos (leg)
public class AreaOfIsoscelesTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Base of a Isosceles triangle: ");
        double b = in.nextDouble();
        System.out.println("Height of a Isosceles triangle: ");
        double h = in.nextDouble();
        double ar = area(b, h);
        System.out.println("Area of Isosceles triangle is: "+String.format("%.2f",ar));
    }
    static double area(double base,double height) {
        return (base*height)/2;
    }
}   
