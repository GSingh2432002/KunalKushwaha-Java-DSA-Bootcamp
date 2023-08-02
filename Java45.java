//Perfect number
import java.util.Scanner;
class Java45
{
    public static void main(String[] args) {
        int n, sum=0;
        System.out.println("Enter any number");
        Scanner obj = new Scanner(System.in);
        n = obj.nextInt();
        for (int i=1; i<n; i++)
        {
            if (n%i ==0)
            {
                sum = sum+i;
            }
        }
        if (n==sum)
        {
            System.out.println("Perfect Number");
        }
        else
        {
            System.out.println("Not a Perfect Number");
        }
    }
}