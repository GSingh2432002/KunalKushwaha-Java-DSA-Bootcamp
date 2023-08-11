//Search in 2D Array
import java.util.Scanner;
import java.util.Arrays;
class Java51
{
    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };
        int target = 3490;
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr, int target)
    {
        for(int row=0; row < arr.length; row++)
        {
            for(int col=0; col < arr[row].length; col++)
            {
                if(arr[row][col] == target)
                {
                    return new int[] {row, col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}