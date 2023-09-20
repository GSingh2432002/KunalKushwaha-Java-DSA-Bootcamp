//Maximal Rectangle 
import java.util.Stack;
class Java108
{
    public static void main(String[] args) {
        char[][] matrix = {
            {'1', '0', '1', '0', '0'},
            {'1', '0', '1', '1', '1'},
            {'1','0','0','1','0'},
            {'1', '0', '0','1','0'}
        };
        System.out.println(maximalRectangle(matrix));

    }
    public static int maximalRectangle(char[][] matrix)
    {
        if(matrix == null || matrix.length == 0)
        {
            return 0;
        }

        int numRows = matrix.length;
        int numCols = matrix[0].length;
        int[] heights = new int[numCols];
        int maxArea = 0;

        for(int row = 0; row < numRows; row++)
        {
            for(int col = 0; col < numCols; col++)
            {
                if(matrix[row][col] == '1')
                {
                    heights[col]++;
                }
                else
                {
                    heights[col] = 0;
                }
            }

            //Find the largest rectangle in the current row
            maxArea = Math.max(maxArea, largestRectangleArea(heights));
        }
        return maxArea;
    }
    public static int largestRectangleArea(int[] heights)
    {
        int n = heights.length;
        int[] left = new int[n];
        int[] right = new int[n];

        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < n; i++)
        {
            while(!stack.isEmpty() && heights[i] <= heights[stack.peek()])
            {
                stack.pop();
            }
            left[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }

        int maxArea = 0;
        for(int i = 0; i < n; i++)
        {
            maxArea = Math.max(maxArea, (right[i] - left[i] - 1) * heights[i]);
        }
        return maxArea;
    }
}