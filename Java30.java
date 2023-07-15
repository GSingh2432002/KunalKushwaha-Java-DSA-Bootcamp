//Taking two numbers by user for swapping two numbers using methods
import java.util.Scanner;
class Java30
{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter First number:- ");
        int num1 = obj.nextInt();
        System.out.println("Enter Second Number:- ");
        int num2 = obj.nextInt();
        swap(num1,num2);
    }
    static void swap(int num1, int num2)
    {
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("Value of num1 is: " + num1 + "Value of num2 is: " + num2);
    }
}