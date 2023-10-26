//Find the Middle Index in Array
import java.util.*;
class Java151
{
    public static void main(String[] args) {
        int[] nums1 = {2,3,-1,8,4};
        int[] nums2 = {1,7,3,6,5,6};
        System.out.println("Middle index of array 1 is: " + findMiddleIndex(nums1));
        System.out.println("Middle index of array 2 is: " + findMiddleIndex(nums2));
    }
    public static int findMiddleIndex(int[] nums)
    {
        int totalSum = 0;
        for(int num : nums)
        {
            totalSum += num;
        }
        int leftSum = 0;
        for(int i=0; i<nums.length; i++)
        {
            if(leftSum == totalSum - leftSum - nums[i])
            {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}
