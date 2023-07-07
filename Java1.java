import java.util.Scanner;
class Java1
{
    public static void main(String args[])
    {   
        int x,y,z;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter value of x = ");
        x=obj.nextInt();
        System.out.print("Enter value of y = ");
        y=obj.nextInt();
        z=x+y;
        System.out.println("Sum = " +z);
    }
}