import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the base : ");
        double base = in.nextDouble();
        System.out.println("Enter height : ");
        double height = in.nextDouble();
        AreaOfTriangle at = new AreaOfTriangle();  //using inheritence
        double area = at.areaoftriangle(base,height);
        System.out.println("Area of Triangle: "+ String.format("%.2f", area));
    }

    private double areaoftriangle(double base, double height) {
        return (base*height)/2;
    }
}
