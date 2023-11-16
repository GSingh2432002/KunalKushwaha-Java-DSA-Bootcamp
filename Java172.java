//Basic Calculator
import java.util.Stack;
class Java172
{
    public static void main(String[] args) {
        String expression = "1 + (2 - 3) + 4";
        int result = calculate(expression);
        System.out.println("Result: "+result);
    }
    public static int calculate(String s)
    {
        Stack<Integer> stack = new Stack<>();
        int result=0;
        int sign=1;
        for(int i=0; i<s.length(); i++)
        {
            char ch=s.charAt(i);

            if(Character.isDigit(ch))
            {
                int num=ch - '0';
                while(i+1<s.length() && Character.isDigit(s.charAt(i+1)))
                {
                    num=num*10+(s.charAt(i+1)-'0');
                    i++;
                }
                result+=sign*num;
            }
            else if(ch=='+')
            {
                sign=1;
            }
            else if(ch=='-')
            {
                sign=-1;
            }
            else if(ch=='(')
            {
                stack.push(result);
                stack.push(sign);
                result=0;
                sign=1;
            }
            else if(ch==')')
            {
                result=result*stack.pop();
                result+=stack.pop();
            }
        }
        return result;
    }
}