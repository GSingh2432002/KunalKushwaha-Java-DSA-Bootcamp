//Future Investment Value
import java.util.Scanner;
class Java53
{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter principle amount");
        double principleAmount = obj.nextDouble();
        System.out.println("Enter the interest rate ");
        double InterestRate = obj.nextDouble();
        System.out.println("Enter the number of year ");
        double year = obj.nextDouble();
        double FV = principleAmount * (1+((InterestRate*year)/100));
        System.out.println("FV Amount: " + FV);
    }
}