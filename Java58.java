//Find Min and Max Element in Array
import java.util.Scanner;
class Java58
{
    public static void main(String[] args) {
        int[] arr = {23,45,111,67,998,3332};
        findMinAndMax(arr);
    }
    static void findMinAndMax(int[] arr)
    {
        if(arr == null || arr.length == 0)
        {
            return;
        }

        int min = arr[0];
        int max = arr[0];
        for(int i = 1; i < arr.length; i++)
        {
            min = Math.min(min,arr[i]);
            max = Math.max(max,arr[i]);
        }
        System.out.println("Minimum value" + min);
        System.out.println("Maximum value" + max);
    }
}