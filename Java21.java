//Counting Occurrences
import java.util.Scanner;
class Java21
{
    public static void main(String[] args) {
        int n = 13345665;

        int count = 0;
        while(n>0)
        {
            int rem = n % 10;
            if (rem==6)
            {
                count++;
            }
            n=n/10;
        }
        System.out.println(count);
    }
}