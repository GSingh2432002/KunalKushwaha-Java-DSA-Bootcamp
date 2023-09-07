//Majority Element II
import java.util.*;
import java.util.Arrays;
class Java89
{
    public static void main(String[] args) {
        int[] nums = {11,33,33,11,33,11};
        List<Integer> ans = majorityElements(nums);
        System.out.println("The majority elements are: ");
        for(int i = 0; i < ans.size(); i++)
        {
            System.out.println(ans.get(i) + " ");
        }
        System.out.println();
    }

    public static List<Integer> majorityElements(int[] nums)
    {
        List<Integer> result = new ArrayList<>();
        
        if (nums == null || nums.length == 0) {
            return result;
        }
        
        int candidate1 = 0, candidate2 = 0, count1 = 0, count2 = 0;
        
        for (int num : nums) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }
        
        // Reset counts and re-scan the array to confirm candidates.
        count1 = 0;
        count2 = 0;
        
        for (int num : nums) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            }
        }
        
        int n = nums.length;
        if (count1 > n / 3) {
            result.add(candidate1);
        }
        if (count2 > n / 3) {
            result.add(candidate2);
        }
        
        return result;
    }
}
