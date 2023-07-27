//ArrayList
import java.util.Scanner;
import java.util.ArrayList;
class Java40
{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        //Syntax
        ArrayList<Integer> List = new ArrayList<>(5);
        // List.add(24);
        // List.add(34);
        // System.out.println(List);

        // List.set(0, 23);
        // System.out.println(List);

        // List.remove(1);
        // System.out.println(List);

        // for (int i = 0; i < 5; i++)
        // List.add(obj.nextInt());

        // System.out.println(List);

        //Get item at any Index
        for (int i = 0; i < 5; i++)
        {
            System.out.println(List.get(i)); //Pass index here, List[Index] sytax will not work here.
        }
    }
}