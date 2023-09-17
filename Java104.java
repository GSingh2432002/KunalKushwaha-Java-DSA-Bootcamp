//Search a 2D Matrix
import java.util.*;
import java.util.Arrays;
class Java104
{
    public static void main(String[] args) {
        int[][] matrix = {
            {1,3,5,7},
            {10,11,16,20},
            {23,30,34,60}
        };

        int target = 344;
        boolean found = searchMatrix(matrix, target);
        if(found)
        {
            System.out.println(target + "found in the matrix");
        }
        else
        {
            System.out.println(target + "Not found in the matrix");
        }
    }
    public static boolean searchMatrix(int[][] matrix, int target)
    {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0)
        {
            return false; //The matrix is empty or invalid
        }
        int rows = matrix.length;
        int cols = matrix[0].length;

        int left = 0;
        int right = rows * cols - 1; //Treat the matrix as a 1D array

        while(left <= right)
        {
            int mid = left + (right - left) / 2; //calculate the middle index
            int midValue = matrix[mid / cols][mid % cols]; //calculate the element at the middle index

            if(midValue == target)
            {
                return true; //found the target
            }
            else if(midValue < target)
            {
                left = mid + 1; //search the right half
            }
            else
            {
                right = mid - 1; //search the left half
            }
        }
        return false; //target not found in the matrix
    }
}
