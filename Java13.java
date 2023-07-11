//Armstrong Number
import java.util.Scanner;
class Java13 
{
    public static void main(String args[])
    {
        int num=407, temp, armstrong=0;
        int original= num;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number for check the is Armstrong number:- ");
        num = obj.nextInt();
        while(num>0)
        {
            temp = num % 10;
            temp += Math.pow(temp,3);
            armstrong = armstrong + temp;
            num = num / 10;
        }
        if(armstrong == original)
        {
            System.out.println("Armstrong Number");
        }
    }
}