//Average of n Numbers and their sum
import java.util.Scanner;
class Java14
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter n:");
        int number = obj.nextInt();
        float avg = 0;
        float sum = 0;
        for(int i=1; i<=number; i++)
        {
            sum = sum + i;
        }

        System.out.println(sum);
        avg = sum/number;
        System.out.println(avg);
    }
}