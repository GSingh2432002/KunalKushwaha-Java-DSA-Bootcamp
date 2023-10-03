//Find all the Numbers Disappeared in an Array
import java.util.*;
import java.util.ArrayList;
import java.util.List;
class Java125
{
    public static void main(String[] args) {
        int[] nums = {1, 1};
        List<Integer> disappearedNumbers = findDisappearIntegers(nums);
        System.out.println(findDisappearIntegers(nums));
    }
    public static List<Integer> findDisappearIntegers(int[] nums)
    {
        int i = 0;
        while (i < nums.length)
        {
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct])
            {
                swap(nums, i, correct);
            }
            else
            {
                i++;
            }
        }

        //Find missing number
        List<Integer> ans = new ArrayList<>();
        for(int index = 0; index < nums.length; index++)
        {
            if(nums[index] != index + 1)
            {
                ans.add(index + 1);
            }
        }
        return ans;
    }
    static void swap(int[] arr, int first, int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}