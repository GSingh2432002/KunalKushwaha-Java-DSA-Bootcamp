//Display Day name b/w 1-7
import java.util.Scanner;
class Java25
{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int day = obj.nextInt();

        switch (day)
        {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }
    }
}