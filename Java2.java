//Swaping two Numbers
import java.util.Scanner;
class Java2
{
    public static void main(String args[])
    {
        int x,y;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the value of x = ");
        x=obj.nextInt();
        System.out.println("Enter the value of y = ");
        y=obj.nextInt();
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("x = " +x +"y = "+y);
    }
}