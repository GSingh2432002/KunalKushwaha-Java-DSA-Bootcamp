//Fruit Color 
import java.util.Scanner;
class Java24
{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String fruit = obj.next();

        switch (fruit)
        {
            case "Mango" -> System.out.println("Green");
            case "Banana" -> System.out.println("Yellow");
            case "Orange" -> System.out.println("Orange");
            case "Grapes" -> System.out.println("Black");
        }
    }
}