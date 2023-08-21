//Search in Rotated Sorted Array
import java.util.*;
import java.io.*;
class Java69
{
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,10,1,2,3};
        int target = 9;
        int ans = find(arr,target);
        System.out.println(ans);
    }
    static int find(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end)
        {
            int mid = (start + end) / 2;
            
            if(arr[mid] == target)
            {
                return mid;
            }
            else if(arr[start] <= arr[mid])
            {
                //start to mid part is sorted
                if(target >= arr[start] && arr[mid] > target)
                {
                    end = mid - 1;
                }
                else 
                {
                    start = mid + 1;
                }
            }
            else if(arr[mid] <= arr[end])
            {
                //mid to end part is sorted
                if(target > arr[mid] && arr[end] >= target)
                {
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}