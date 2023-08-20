//Search in Rotated Sorted Array
import java.util.*;
class Java69
{
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2,3};
        System.out.println(findPivot(arr));
    }

    static int search(int[] nums, int target)
    {
        int pivot = findPivot(nums);

        //If you did not find a pivot, it means the array is not rotated
        if(pivot == -1)
        {
            //Just do normal binary search
            return binarySearch(nums,target,0,nums.length - 1);
        }

        //If pivot is found, you have found 2 asc sorted arrays
        if(target >= nums[0])
        {
            return binarySearch(nums, target,0,pivot - 1);
        }

        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }
    
    static int binarySearch(int[] arr, int target, int start, int end)
    {
        while(start <= end)
        {
            //find middle element
            //int mid = (start + end) / 2;
            int mid = start + (end - start) / 2;

            if(target < arr[mid])
            {
                end = mid - 1;
            }
            else if(target > arr[mid])
            {
                start = mid + 1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }

    static int findPivot(int[] arr)
    {
        int start = 0;
        int end = arr.length - 1; 
        while (start <= end)
        {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if(mid < end && arr[mid] > arr[mid + 1])
            {
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1])
            {
                return mid - 1;
            }
            if(arr[mid] <= arr[start])
            {
                end = mid - 1;
            }
            else 
            {
                start = mid + 1;
            }
        }
        return -1;
    }
}