import java.util.Scanner;
class Java12
{
    public static void main(String args[])
    {
        long number, sum;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number: ");
        number = obj.nextLong();
        for(sum=0;number!=0;number=number/10)
        {
            sum = sum + number %10;
        }
        System.out.println("sum of digits" + sum);
        
    }
}