//Alphabet Case Check
import java.util.Scanner;
class Java20
{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        char ch = obj.next().charAt(0);
        if (ch >= 'a' && ch <= 'z')
        {
            System.out.println("Lowercase");
        }
        else 
        {
            System.out.println("Uppercase");
        }
    }
}