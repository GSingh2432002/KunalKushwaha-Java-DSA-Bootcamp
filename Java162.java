//Number of subarrays with bounded maximum
import java.util.*;
class Java162
{
    public static void main(String[] args) {
        int[] nums = {2,1,4,3};
        System.out.println("The number of subarrays is "+numSubarrayBoundedMax(nums, 2, 3));
    }
    public static int numSubarrayBoundedMax(int[] arr, int left, int right)
    {
        int si=0;
        int ei=0;
        int n=arr.length;
        int ans=0;
        int prevc=0;

        while(ei<n)
        {
            if(left<=arr[ei] && arr[ei]<=right)
            {
                prevc=ei-si+1;
                ans+=prevc;
            }else if(arr[ei]<left)
            {
                ans+=prevc;
            }else
            {
                si=ei+1;
                prevc=0;
            }
            ei++;
        }
        return ans;
    }
}
