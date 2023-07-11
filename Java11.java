//Fibonacci Series
import java.util.Scanner;
class Java11 
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        int n, i, nextTerm, firstTerm=0, secondTerm=1;
        System.out.println("Fibonacci series till n terms" );
        n = obj.nextInt();
        // System.out.println(firstTerm + " " + secondTerm + " ");
        for(i=0; i<n; i++)
        {
            nextTerm = firstTerm + secondTerm;
            System.out.println(nextTerm+" ");
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}