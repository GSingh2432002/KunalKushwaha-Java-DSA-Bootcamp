//Find Peak Element in Mountain Array
import java.util.*;
class Java67
{
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,0};
        int ans = peakIndexInMountainArray(arr);
        System.out.println(ans);
    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end)
        {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1])
            {
                //you aare in dec part of array
                //this may be the ans, but look at left
                //this is why end != mid -1 
                end = mid;
            }
            else 
            {
                //you are in asc part of array
                start = mid + 1; //because we know that mid+1 element > mid element
            }
        }
        return start;
    }
}
