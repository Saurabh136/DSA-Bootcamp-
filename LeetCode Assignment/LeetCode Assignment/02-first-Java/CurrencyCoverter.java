//Input currency in rupees and output in USD.
import java.text.DecimalFormat;
import java.util.Scanner;

public class CurrencyCoverter {
    public static void main(String[] args) {
        double rupee, dollar,pounds,code,euro;
        DecimalFormat df = new DecimalFormat("##.##");
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the Currency code: \n1 : Rupees \n2 : Dollars \n3 : Pounds \n4 : Euros ");
         code = in.nextInt();
        
         if(code==1) {
            System.out.println("Enter amount in Rupees: ");
            rupee = in.nextFloat();
            dollar = rupee/81.50;
            System.out.println("Amount in Dollars: "+ df.format(dollar));
            pounds = rupee/92.46;
            System.out.println("Amount in British Pounds: " + df.format(pounds));
            euro = rupee/80.46;
            System.out.println("Amount in Euros: " +df.format(euro));
         }
         else if(code == 2) {
            System.out.println("Enter amount in Dollars: ");
            dollar = in.nextFloat();
            rupee = dollar * 81.50;
            System.out.println("Amount in Rupees : "+ df.format(rupee));
            pounds = dollar * 0.88;
            System.out.println("Amount in British Pounds: " + df.format(pounds));
            euro = dollar * 1.01;
            System.out.println("Amount in Euros: " +df.format(euro));

         }
         else if(code == 3) {
            System.out.println("Enter amount in Pounds: ");
            pounds = in.nextFloat();
            rupee = pounds * 92.59;
            System.out.println("Amount in Rupees: "+ df.format(rupee));
            dollar = pounds * 1.14;
            System.out.println("Amount in US Dollars: " + df.format(dollar));
            euro = pounds * 1.15;
            System.out.println("Amount in Euros: " +df.format(euro));
         }
         else if(code == 4) {
            System.out.println("Enter amount in Euros: ");
            euro = in.nextFloat();
            rupee = euro * 80.50;
            System.out.println("Amount in Rupees: "+ df.format(rupee));
            dollar = euro * 0.99;
            System.out.println("Amount in British Pounds: " + df.format(dollar));
            pounds = euro * 0.87;
            System.out.println("Amount in Pounds: " +df.format(pounds));
         }
         else {
            System.out.println("Invalid Code:");
         } 
     }
}
