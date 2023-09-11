//Minimum Size Subarray Sum
import java.util.*;
class Java95
{
    public static void main(String[] args) {
        int[] nums = {2,3,1,2,4,3};
        int target = 7;
        int minLength = minSubArrayLen(target, nums);
        System.out.println(minLength);
    }
    
    public static int minSubArrayLen(int target, int[] nums)
    {
        int minLength = Integer.MAX_VALUE;
        int sum = 0;
        int left = 0;
        int right = 0;

        for(right = 0; right < nums.length; right++)
        {
            sum = sum + nums[right];

            while(sum >= target)
            {
                //Update the minimum length
                minLength = Math.min(minLength, right - left + 1);

                //Try to minimize the subarray size by moving the left pointer
                sum = sum - nums[left];
                left++;
            }
        }
        //If minLength is stilll Integer.MAX_VALUE, no subarray is found
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}