//Area of Triangle
import java.util.Scanner;
class Java10 {
    public static void main(String args[])
    {
        double base, height, Area;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Base :- ");
        base = obj.nextDouble();
        System.out.println("Enter the Height :- ");
        height= obj.nextDouble();
        Area = 0.5 * base * height;
        System.out.println("Area of Triangle:- " + Area);
    }
}