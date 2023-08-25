//Largest Sum Contiguous Subarray 
import java.util.*;
class Java75
{
    public static void main(String[] args) {
        int[] nums = {2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
    static int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;  /*Kyu lenge Int.MinValue, max wo 
        store karega jo subarray ka sum sbse jyda hoga, aur worst case bhi handle krnge
        th worst case mein sab number negative bhi ho skte hai.*/
        int curSum = 0;

        for(int i=0; i<nums.length; i++)
        {
            curSum = curSum + nums[i];
            if(curSum > maxSum)
            {
                maxSum = curSum;
            }
            if(curSum < 0)
            {
                curSum = 0;
            }
        }
        return maxSum;
    }
}