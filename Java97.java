//Minimum Adjacent Swaps for K Consecutive Ones
import java.util.*;
import java.util.*;
import java.util.Arrays;
class Java97
{
    public static void main(String[] args) {
        
    }
    
}
int totalOnes = 0;

        // Count the total number of ones in the array
        for (int num : arr) {
            if (num == 1) {
                totalOnes++;
            }
        }

        // If the total number of ones is less than K, it's impossible to group K consecutive ones.
        if (totalOnes < K) {
            return -1;
        }

        int onesInCurrentWindow = 0;
        int minSwaps = Integer.MAX_VALUE;

        // Initialize the window [left, right]
        int left = 0;
        int right = 0;

        // Count ones in the initial window of size K
        for (; right < K; right++) {
            if (arr[right] == 1) {
                onesInCurrentWindow++;
            }
        }

        // Slide the window and calculate the minimum swaps
        while (right < arr.length) {
            minSwaps = Math.min(minSwaps, K - onesInCurrentWindow);

            // Move the window one position to the right
            if (arr[left] == 1) {
                onesInCurrentWindow--;
            }
            left++;

            if (arr[right] == 1) {
                onesInCurrentWindow++;
            }
            right++;
        }

        minSwaps = Math.min(minSwaps, K - onesInCurrentWindow);

        return minSwaps;