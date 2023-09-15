//Find the median
import java.util.*;
import java.io.*;
import java.util.Arrays;
class Java101
{
    public static void main(String[] args) {
       int[] nums = {3,1,4,1,5,9,2,6,5,3,5};
       double median = findMedian(nums);
       System.out.println(median);
    }
    public static double findMedian(int[] nums)
    {
        //sort the array
        Arrays.sort(nums);

        int n = nums.length;

        if(n % 2 == 0)
        {
            //If the array has an even number of elements, average the middle two elements
            int mid1 = nums[n / 2 - 1];
            int mid2 = nums[n / 2];
            return (double) (mid1 + mid2) / 2;
        }
        else
        {
            //If the array has an odd number of elements, return the middle element
            return (double) nums[n / 2];
        }
    }
}