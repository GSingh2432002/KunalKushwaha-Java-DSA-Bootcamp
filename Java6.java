//Perimeter and Area of Square
import java.util.Scanner;
class Java6 {
    public static void main(String args[])
    {
        int side, area, perimeter;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the side = ");
        side=obj.nextInt();
        perimeter = 4*side;
        area = side*side;
        System.out.println("Perimeter of Square" + perimeter);
        System.out.println("area of square" + area);
    }
}