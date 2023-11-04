//Max chunks to make Array Sorted
import java.util.*;
class Java161
{
    public static void main(String[] args) {
        int[] arr = {2,1,3,4,4};
        System.out.println("Minimum number of chunks required: " + maxChunksToSorted(arr));
    }
    public static int maxChunksToSorted(int[] arr)
    {
        int[] rmin = new int[arr.length + 1];

        rmin[arr.length] = Integer.MAX_VALUE;
        for(int i=arr.length-1; i>=0; i--)
        {
            rmin[i] = Math.min(rmin[i+1], arr[i]);
        }

        int lmax = Integer.MIN_VALUE;
        int count = 0;
        for(int i=0; i<arr.length; i++)
        {
            lmax = Math.max(lmax, arr[i]);
            if(lmax <= rmin[i+1])
            count++;
        }
        return count;
    }
}