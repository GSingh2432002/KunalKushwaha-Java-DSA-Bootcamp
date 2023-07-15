//Print sum of two numbers using method and return
import java.util.Scanner;
class Java28
{
    public static void main(String[] args) {
        int answer = sum2();
        System.out.println(answer);
    }
    static int sum2()
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = obj.nextInt();
        System.out.println("Enter second number");
        int num2 = obj.nextInt();
        int sum = num1 + num2;
        return sum;
    }
}