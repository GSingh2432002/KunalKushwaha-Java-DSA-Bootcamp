//find all pairs on integer array whose sum is equal to given number
import java.util.Arrays;
import java.util.*;
class Java83
{
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {2, 6, 5, 8, 11};
        int target = 104;
        String ans = twoSum(n, arr, target);
        System.out.println("This is the answer for variant 1: " + ans);   
    }
    public static String twoSum(int n, int[] arr, int target)
    {
        Arrays.sort(arr);
        int left = 0, right = n - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                return "YES";
            } else if (sum < target) left++;
            else right--;
        }
        return "NO";
    }
}