//Calculator
import java.util.Scanner;
class Java23
{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int ans = 0;
        while (true)
        {
            System.out.println("Enter the operator: ");
            char op = obj.next().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%')
            {
                System.out.println("Enter two Numbers: ");
                int num1 = obj.nextInt();
                int num2 = obj.nextInt();

                if (op == '+')
                {
                    ans = num1 + num2;
                }

                if (op == '-')
                {
                    ans = num1 - num2;
                }

                if (op == '*')
                {
                    ans = num1 * num2;
                }

                if (op == '/')
                {
                    if (num2 != 0)
                    {
                        ans = num1 / num2;
                    }
                }

                if (op == '%')
                {
                    ans = num1 % num2;
                }
            }
               else if (op == 'x' || op == 'X')
                {
                    break;
                }
                else 
                {
                    System.out.println("Invalid Operation");
                }
            System.out.println(ans);
        }
    }
}
