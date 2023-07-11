//Calculate Electric Bill
import java.util.Scanner;
class Java17
{
    public static void main(String args[])
    {
        double unit, price, TotalBill;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the total unit consume:- ");
        unit = obj.nextDouble();
        System.out.println("Enter the price of a unit current price is: ");
        price = obj.nextDouble();
        TotalBill = unit*price;
        System.out.println("Total Bill = " + TotalBill);
    }
}