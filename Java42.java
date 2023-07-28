//Max Number in between Range
import java.util.Scanner;
import java.util.Arrays;
class Java42
{
    public static void main(String[] args) {
         int[] arr = {1,2,3,4,5};
         System.out.println(max(arr));
         System.out.println(maxRange(arr, 0, 3));
    }
    //Max value of an Array in Range
    static int maxRange(int[] arr, int start, int end)
    {
        int maxVal = arr[start];
        for ( int i = 0; i <= end; i++)
        {
            if (arr[i] > maxVal)
            {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    //Max value of an Array
    static int max(int[] arr)
    {
        int maxVal = arr[0];
        for (int i =0; i < arr.length; i++)
        {
            if (arr[i] > maxVal)
            {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}