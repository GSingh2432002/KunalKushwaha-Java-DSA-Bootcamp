//Rotate Array
import java.util.*;
import java.util.Arrays;
class Java74
{
    public static void main(String[] args) {
       int[] arr = {1,2,3,4,5,6,7,8,9,11,13,17};
       int n = arr.length;
       int ans = reverseArray(arr,0,n-1);
       System.out.println(Arrays.toString(arr));
    }
    static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;

        reverseArray(nums,0,n-1);
        reverseArray(nums,0,k-1);
        reverseArray(nums,k,n-1);
    }
   static int reverseArray(int[] nums,int start, int end)
    {
        for(int i=start, j=end;i<j;i++,j--)
        {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        return reverseArray(nums, 1, end - 1);
    }
    
}