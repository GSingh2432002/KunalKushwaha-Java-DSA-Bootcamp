import java.util.Scanner;
class Java3
{
    public static void main(String args[])
    {
        int x,y,z;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the value of x = ");
        x=obj.nextInt();
        System.out.println("Enter the value of y = ");
        y=obj.nextInt();
        z=x;
        x=y;
        y=z;
        System.out.println("x = " + x + "y = " + y);
    }
}
