//Average of marks
import java.util.Scanner;
class Java15
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the  num of subject");
        int numOfSub = obj.nextInt();
        int sum = 0;
        for(int i = 0; i<numOfSub; i++)
        {
            System.out.println("One subject enter the marks of subject:- ");
            float marks = obj.nextFloat();
            sum +=marks;
        }
        float avg = sum/numOfSub;
        System.out.println(avg);
    }
}