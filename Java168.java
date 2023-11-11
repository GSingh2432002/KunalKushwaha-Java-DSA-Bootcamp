//Find Minimum in Rotated sorted Array II
import java.util.*;
class Java168
{
    public static void main(String[] args) {
        int[] nums = {1,3,5};
        int result = findMin(nums);
        System.out.println("Minimum element in the rotated sorted array: " + result);
    }
    public static int findMin(int[] nums)
    {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[right]) {
                // The minimum element must be in the right half
                left = mid + 1;
            } else if (nums[mid] < nums[right]) {
                // The minimum element must be in the left half
                right = mid;
            } else {
                // If nums[mid] == nums[right], we can't determine which half to go, so reduce the search space
                right--;
            }
        }
        return nums[left];
    }
}