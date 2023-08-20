//Found in mountain Array
import java.util.*;
class Java68
{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,10,5,4,2};
        int target = peakIndexMountainArray(arr);
        System.out.println(target);
    }
    int search(int[] arr, int target)
    {
        int peak = peakIndexMountainArray(arr);
        int firstTry = orderAgnosticBS(arr, target,0,peak);
        if (firstTry != -1)
        {
            return firstTry;
        }
        //try to search in second half
        return orderAgnosticBS(arr,target,peak+1,arr.length - 1);
    }
    static int peakIndexMountainArray(int[] arr)
    {
        int start = 0;
        int end = arr.length - 1;

        while (start < end)
        {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid+1])
            {
                end = mid;
            }
            else
            {
                //you are in the asc part of array
                start = mid + 1;
            }
        }
        return start;
    }
    static int orderAgnosticBS(int[] arr, int target, int start, int end)
    {
    boolean isAsc = arr[start] < arr[end];

        while(start <= end)
        {
            int mid = start = (end - start) / 2;

            if (arr[mid] == target)
            {
                return mid;
            }

            if(isAsc)
            {
                if (target < arr[mid])
                {
                    end = mid -1;
                }
                else
                {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}