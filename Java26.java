//Nested Switch
import java.util.Scanner;
class Java26
{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int empID = obj.nextInt();
        String department = obj.next();

        switch (empID)
        {
            case 1 -> System.out.println("Gaurav Singh");
            case 2 -> System.out.println("Gaurav Kapoor");
            case 3 ->
            {
                System.out.println("Emp Number 3");
                switch (department)
                {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("No department entered");
                }
            }
            default -> System.out.println("Enter correct EmpID");
        }
    }
}