public class PositiveNegative {
    public static void main(String[]args) {
        double number = 12.3;

        //true if number is less then 0;
        if (number < 0.0)
            System.out.println(number + "is a negative number");
        //true if number is greater then 0;
        else if (number > 0.0)
            System.out.println(number + "is a positive number");
        else
            System.out.println(number + "is 0");    

    }
}