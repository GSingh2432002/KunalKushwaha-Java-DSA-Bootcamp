//largest Rectangle in Histogram
import java.util.*;
import java.util.Stack;
class Java170
{
    public static void main(String[] args) {
        int[] heights = {2, 1, 5, 6, 2, 3};
        int result = largestRectangleArea(heights);
        System.out.println("Largest Rectangle Area: " + result);
    }
    public static int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;

        for (int i = 0; i <= heights.length; i++) {
            // For the last bar, assume its height is 0 to calculate the remaining areas.
            int currentHeight = (i == heights.length) ? 0 : heights[i];

            while (!stack.isEmpty() && currentHeight <= heights[stack.peek()]) {
                int height = heights[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                maxArea = Math.max(maxArea, height * width);
            }

            stack.push(i);
        }

        return maxArea;
    }
}