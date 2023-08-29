import java.util.*;
import java.util.Arrays;
class Java79
{
public static void main(String[] args) {
        int[] nums1 = new int[6];
        nums1[0] = 1;
        nums1[1] = 3;
        nums1[2] = 5;
        int[] nums2 = {2, 4, 6};
        merge(nums1, 3, nums2, 3);
        
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1; // Pointer for nums1
        int j = n - 1; // Pointer for nums2
        int k = m + n - 1; // Pointer for the merged array
        
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
        
        // If there are remaining elements in nums2
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}
}

