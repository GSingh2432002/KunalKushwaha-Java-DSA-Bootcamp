//Area of Cirlce
import java.util.Scanner;
class Java8
{
    public static void main(String args[])
    {
        double radius, area;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the radius");
        radius = obj.nextInt();
        area = 3.14*radius*radius;
        System.out.println("Area of circle" + area);
    }
}