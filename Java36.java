//Array Input
import java.util.Scanner;
import java.util.Arrays;
class Java36
{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = obj.nextInt(); 
        } 

        System.out.println(Arrays.toString(arr)); //For printing arrays easily

        // for (int i = 0; i < arr.length; i++) //For printing arrays using for Loop
        // {
        //     System.out.println(arr[i]);
        // }
    }
}