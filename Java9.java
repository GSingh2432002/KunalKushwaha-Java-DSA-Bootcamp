//Area of Rectangle
import java.util.Scanner;
class Java9
{
    public static void main(String args[])
    {
        double length, width, AreaOfRectangle;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the length of Reactangle:- ");
        length = obj.nextDouble();
        System.out.println("Enter the Width of the Rectangle:- ");
        width = obj.nextDouble();
        AreaOfRectangle = length * width;
        System.out.println("Area of Rectangle:- " + AreaOfRectangle);

    }
}