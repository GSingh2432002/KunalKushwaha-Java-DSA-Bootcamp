//Maximum Product Subarray
import java.util.*;
class Java87
{
    public static void main(String[] args) {
        int[] nums = {2,3,-2,4};
        int maxProd = maxProduct(nums);
        System.out.println(maxProd);
    }
    public static int maxProduct(int[] nums)
    {
        if( nums == null || nums.length == 0)
        {
            return 0;
        }
        int maxProduct = nums[0]; // Initialize the maximum product.
        int minProduct = nums[0]; // Initialize the minimum product.
        int result = nums[0]; // Initialize the result to the first element.
        
        for(int i = 1; i<nums.length; i++)
        {
            // If the current number is negative, swap maxProduct and minProduct because
            // multiplying by a negative number can make the minimum product the maximum product.
            if(nums[i] < 0)
            {
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }
             // Update maxProduct and minProduct for the current element.
             maxProduct = Math.max(nums[i], maxProduct * nums[i]);
             minProduct = Math.min(nums[i], minProduct * nums[i]);

            // Update the result with the maximum product so far.
            result = Math.max(result, maxProduct);
        }
        return result;
    }
}