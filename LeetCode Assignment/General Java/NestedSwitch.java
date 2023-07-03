import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empId = in.nextInt();
        String department = in.next();

        switch(empId) {
            
            case 1 :
              System.out.println("Saurabh");
              break;
            case 2:
              System.out.println("Ronaldo");
              break;
            case 3:
              System.out.println("Employee no 3:");
              switch(department) {
                case "IT" :
                 System.out.println("IT department");
                break;
                case "Management" :
                 System.out.println("Management");
                break;
                default :
                 System.out.println("No department found");  
             } 
             break;
            default:
              System.out.println("Enter a valid EmpID"); 
        }
    }
    
}
