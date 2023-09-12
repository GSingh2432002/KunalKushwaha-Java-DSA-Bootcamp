//Three way partitioning
import java.util.*;
import java.util.Arrays;
class Java96
{
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,4,4,2,3,1};
        int lowValue = 2;
        int highValue = 4;
        threeWayPartition(arr, lowValue, highValue);

        System.out.println("Three-way partitioned array: ");
        for(int num : arr)
        {
            System.out.println(num + " ");
        }
    }
    public static void threeWayPartition(int[] arr, int lowValue, int highValue)
    {
        int n = arr.length;

        int low = 0;
        int high = n - 1;
        int i = 0;

        for(i = 0; i <= high;)
        {
            if(arr[i] < lowValue)
            {
                //Swap arr[i] and arr[high], and move high pointer
                swap(arr, i, low);
                i++;
                low++;
            }
            else if(arr[i] > highValue)
            {
                // Swap arr[i] and arr[high], and move high pointer
                swap(arr, i, high);
                high--;
            }
            else
            {
                //ELement is already in the right place, move i pointer
                i++;
            }
        }
    }
    public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}