//Rotate Array
import java.util.*;
import java.util.Arrays;
class Java74
{
    public static void main(String[] args) {
       
    }
    static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;

        reverseArray(nums,0,n-1);
        reverseArray(nums,0,k-1);
        reverseArray(nums,k,n-1);
    }
   static void reverseArray(int[] nums,int start, int end)
    {
        for(int i=start, j=end;i<j;i++,j--)
        {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        reverseArray(nums, start+1, end-1);
    }
    
}