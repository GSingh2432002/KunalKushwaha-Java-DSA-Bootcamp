//Multi-Dimensional Arrays
import java.util.Scanner;
import java.util.Arrays;
class Java39
{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int[][] arr = new int[3][3];

        //Input
        for (int row = 0; row < arr.length; row++)
        {
            for (int col = 0; col < arr[row].length; col++)
            arr[row][col] = obj.nextInt();
        }

        //Output
        for (int row = 0; row < arr.length; row++)
        {
            System.out.println(Arrays.toString(arr[row]));
        }
    }
}