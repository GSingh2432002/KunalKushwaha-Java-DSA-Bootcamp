import java.util.Scanner;
class Java43
{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        long year = obj.nextLong();
        if (year %4 == 0 && year %100 != 0)
        {
            System.out.println(year + "leap year");
        }
        else if (year %400 == 0)
        {
            System.out.println(year + "leap year");
        }
        else
        {
            System.out.println(year +"not a leap year");
        }
    }
}