//Method Overloading
import java.util.Scanner;
class Java34
{
    public static void main(String[] args) {
        int answer1 = sum(12,12, 12);
        System.out.println(answer1);
        int answer2 = sum(12, 12);
        System.out.println(answer2);
    }


    static int sum(int a, int b)
    {
        return a + b;
    }
    static int sum(int a, int b, int c)
    {
        return a + b + c;
    }
}