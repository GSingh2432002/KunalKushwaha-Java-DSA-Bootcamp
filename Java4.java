import java.util.Scanner;
class Java4
{
    public static void main(String args[])
    {
        int Minutes,Hours;
        float Min;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the value of time in Minutes");
        Minutes=obj.nextInt();

        Hours=Minutes/60;
        System.out.println("Hours = "+ Hours);
        Min=Minutes%60;
        System.out.println("Minutes = "+ Min);
    }
}