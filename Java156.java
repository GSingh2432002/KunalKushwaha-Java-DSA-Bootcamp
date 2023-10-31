//Max chunks to Make sorted
import java.util.*;
class Java156
{
    public static void main(String[] args) {
        int[] arr = {4,3,2,1,0};
        System.out.println("Minimum number of chunks required: "+maxChunksToSorted(arr));
    }
    public static int maxChunksToSorted(int[] arr)
    {
        int n = arr.length;
        int ans = 0;
        int currMax = arr[0];
        for(int i=0; i<n; i++)
        {
            currMax = Math.max(arr[i],currMax);
            if(currMax == i)
            {
                ans++;
            }
        }
        return ans;
    }
}