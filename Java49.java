//Search in Range
import java.util.Scanner;
class Java49
{
    public static void main(String[] args) {
        int[] arr = {1,45,67,78,999,98};
        int target = 67;
        System.out.println(linearSearch(arr, target, 1, 5 ));
    }
    static int linearSearch(int[] arr, int target, int start, int end )
    {
        if (arr.length == 0)
        {
            return -1;
        }
        for (int index = start; index <= end; index++)
        {
            int element = arr[index];
            if (element == target)
            {
                return index;
            }
        }
        return -1;
    }
}