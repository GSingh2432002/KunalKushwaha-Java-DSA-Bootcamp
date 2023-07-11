//Area and Circumference of Circle
import java.util.Scanner;
class Java7
{
    public static void main(String args[])
    {
        double Radius, Circumference, Area;
        Scanner obj = new Scanner (System.in);
        System.out.println("Enter the Radius:- ");
        Radius = obj.nextInt();
        Circumference = 2*3.14*Radius;
        Area = 3.14*Radius*Radius;
        System.out.println("Circumference = " + Circumference);
        System.out.println("Area = " + Area);
    }
}