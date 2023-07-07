import java.util.Scanner;
class Java5
{
    public static void main(String args[])
    {
        int a,b,max;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number");
        a=obj.nextInt();
        System.out.println("Enter the number");
        b=obj.nextInt();
        max=(a>b)?a:b;
        System.out.println("Maximum number is = " +max);
    }
}