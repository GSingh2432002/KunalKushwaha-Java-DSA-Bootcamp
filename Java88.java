//Longest Consecutive Sequence
import java.util.*;
import java.util.Arrays;
class Java88
{
    public static void main(String[] args) {
        int[] arr = {0,1,2,5,6,7,8,9,10,12,13,14,15};
        int ans = findLongestConsecutiveSequence(arr);
        System.out.println(ans);
    }
    public static int findLongestConsecutiveSequence(int[] arr)
    {
        if(arr == null || arr.length == 0)
        {
            return 0;
        }

        //Sort the array
        Arrays.sort(arr);

        int longestSubsequenceLength = 1;
        int currentSubsequenceLength = 1;

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == arr[i - 1])
            {
                //If the current element is consecutive to the previous one
                currentSubsequenceLength++;
            }
            else if(arr[i] != arr[i - 1])
            {
                //If the current element is not equal to the previous one
                currentSubsequenceLength = 1;
            }

            //Update the longest subsequence length
            if(currentSubsequenceLength > longestSubsequenceLength)
            {
                longestSubsequenceLength = currentSubsequenceLength;
            }
        }
        return longestSubsequenceLength;
    }
}