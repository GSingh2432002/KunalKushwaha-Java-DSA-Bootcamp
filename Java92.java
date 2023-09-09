//Triplet Sum in Array
import java.util.*;
import java.util.Arrays;
class Java92
{
    public static void main(String[] args) {
        int[] arr = {1,2,45,6,10,8};
        int targetSum = 22;
        findTriplets(arr, targetSum);
    }

    static void findTriplets(int[] arr, int targetSum)
    {
        Arrays.sort(arr);

        for(int i = 0; i < arr.length - 2; i++)
        {
            int left = i + 1;
            int right = arr.length - 1;
            int firstElement = arr[i];

            while(left < right)
            {
                int currentSum = firstElement + arr[left] + arr[right];

                if(currentSum == targetSum)
                {
                    System.out.println(("Triplet found: " + firstElement + ", " + arr[left] + ", " + arr[right]));
                    left++;
                    right--;
                }
                else if(currentSum < targetSum)
                {
                    left++;
                }
                else
                {
                    right--;
                }
            }
        }
    }
}