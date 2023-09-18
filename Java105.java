//Find Maximum 1's Row
import java.util.*;
import java.io.*;
class Java105
{
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 1, 1, 1},
            {0, 1, 1, 1},
            {0, 0, 0, 1},
            {0, 0, 0, 0}
        };

        int answer = findRow(matrix);
        
        if (answer != -1) {
            System.out.println("Row with the maximum number of 1's: " + answer);
        } 
        else {
            System.out.println("No row with 1's found.");
        }
    }
    public static int findRow(int[][] matrix)
    {
        int oMax = 0;
        int r = 0;

        for(int i = 0; i < matrix.length; i++)
        {
            int coir = binarySearch(matrix, i); //count of 1's in ith row
            if(coir > oMax)
            {
                oMax = coir;
                r = i;
            }
        }
        return r;
    }
    public static int binarySearch(int matrix[][], int r)
    {
        int low = 0;
        int high = matrix[0].length-1;
        int fi1 = matrix[0].length;

        while(low < high)
        {
            int mid = (low + high) / 2;

            if(matrix[r][mid] == 1)
            {
                fi1 = mid;
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }
        int count = matrix[0].length - fi1;
        return count;
    }
}