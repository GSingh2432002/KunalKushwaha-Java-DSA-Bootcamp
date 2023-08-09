// Currency Converter
import java.util.Scanner;
class Java46
{
    public static void main(String[] args) {
        System.out.println("1 Rupee");        
        System.out.println("1 Dollar");        

        // take input
        Scanner obj = new Scanner(System.in);
        // take currency as input
        System.out.println("Choose the currency");

        int choice = obj.nextInt();
        System.out.println("Enter the amount");
        double amount = obj.nextDouble();

        //convert the amount
        switch (choice)
        {
            case 1:
            Rupee_to_other(amount);
            break;
            default:
                System.out.println("Invalid Choice");
        }
    }

public static void Rupee_to_other(double amt)
{
    System.out.println("1 Rupee = " + 0.013);
    System.out.println();

    System.out.println(amt +  "Rupee = " + (amt*0.013) + "Dollar");
    System.out.println();

    System.out.println("1 Rupee = " + 0.012 + "Euro");
    System.out.println();
    System.out.println(amt + "Rupee = " + (amt * 0.012) + "Euro");
    System.out.println();
}
}