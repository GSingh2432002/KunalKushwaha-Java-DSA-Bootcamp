//Product of Array Except self
import java.util.*;
class Java158
{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] result = productExceptSelf(arr);

        System.out.println("Result: ");
        for(int num : result)
        {
            System.out.println(num + " ");
        }
    }
    public static int[] productExceptSelf(int[] nums)
    {
        int n = nums.length;
        int[] result = new int[n];
        
        int[] leftProducts = new int[n];
        int[] rightProducts = new int[n];
        
        leftProducts[0] = 1;
        rightProducts[n - 1] = 1;
        
        for (int i = 1; i < n; i++) {
            leftProducts[i] = leftProducts[i - 1] * nums[i - 1];
        }
        
        for (int i = n - 2; i >= 0; i--) {
            rightProducts[i] = rightProducts[i + 1] * nums[i + 1];
        }
        
        for (int i = 0; i < n; i++) {
            result[i] = leftProducts[i] * rightProducts[i];
        }
        
        return result;
    }
}