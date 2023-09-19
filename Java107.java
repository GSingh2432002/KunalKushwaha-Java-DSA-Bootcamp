//Kth Smallest Element in a Sorted Matrix
import java.util.PriorityQueue;
class Java107
{
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 5, 9},
            {10, 11, 13},
            {12, 13, 15}
        };
        int k = 4;
        int result = kthSmallest(matrix, k);
        System.out.println("The " + k + "th smallest element is: " + result);
    }
    public static int kthSmallest(int[][] matrix, int k)
    {
        int n = matrix.length;
        int low = matrix[0][0];
        int high = matrix[n-1][n-1];

        while(low < high)
        {
            int mid = low + (high - low) / 2;
            int count = 0;
            int j = n - 1;

            for(int i = 0; i < n; i++)
            {
                while(j >= 0 && matrix[i][j] > mid)
                {
                    j--;
                }
                count += (j + 1);
            }
            if(count < k)
            {
                low = mid + 1;
            }
            else
            {
                high = mid;
            }
        }
        return low;
    }
}