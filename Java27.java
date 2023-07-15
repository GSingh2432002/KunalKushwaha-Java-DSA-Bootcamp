//Sum of two Numbers using methods
import java.util.Scanner;
class Java27
{
    public static void main(String[] args) {
        sum();
    }

    static void sum()
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter number 1:");
        int num1 = obj.nextInt();
        System.out.println("Enter number 2:");
        int num2 = obj.nextInt();
        int sum = num1 + num2;
        System.out.println("the Sum = " + sum);
    }
}