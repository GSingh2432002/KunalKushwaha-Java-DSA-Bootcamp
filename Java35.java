//Prime or not using While Loop
import java.util.Scanner;
class Java35
{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        boolean ans = isPrime(n);
        System.out.println(ans);
    }

    static boolean isPrime(int n)
    {
        if (n <= 1)
        {
            return false;
        }
        int c = 2;
        while (c * c <= n)
        {
            if (n % c == 0)
            {
                return false;
            }
            c++;
        }
        return c * c > n;
    }
}