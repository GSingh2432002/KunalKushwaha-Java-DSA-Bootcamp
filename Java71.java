//Split Array Largest Sum
import java.util.*;
class Java71
{
    public static void main(String[] args) {
        int[] arr = {7,2,5,10,8};
        int ans = splitArray(arr,2);
        System.out.println(ans);
    }
    public static int splitArray(int[] arr, int m)
    {
        int max = 0;
        int sum = 0;

        for(int val : arr)
        {
            sum += val;
            max = Math.max(val,max);
        }

        if(m == arr.length)
        {
            return max;
        }
        
        int lo = max;
        int hi = sum;
        int ans = 0;
        while (lo<=hi)
        {
            int mid = lo + (hi - lo) / 2;

            if(isPossible(arr,mid,m) == true)
            {
                ans = mid;
                hi =  mid-1;
            }
            else
            {
                lo = mid + 1;
            }
        }
        return ans;
    }

    public static boolean isPossible(int[] arr, int mid, int m)
    {
        int sa = 1;
        int sum = 0;
        for(int i=0; i<arr.length; i++)
        {
            sum += arr[i];
            
            if(sum > mid)
            {
                sa++;
                sum = arr[i];
            }
        }
        return sa <= m;
    }
}
