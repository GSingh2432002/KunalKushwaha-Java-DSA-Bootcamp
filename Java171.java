//Min Stack
import java.util.Stack;
class Java171
{
    public static void main(String[] args) {

        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);

        System.out.println("Min element: " + minStack.getMin());  // Output: -3

        minStack.pop();

        System.out.println("Top element: " + minStack.top());  // Output: 0
        System.out.println("Min element: " + minStack.getMin());  // Output: -2
    }
    }
    private Stack<Integer> stack;

    // Auxiliary stack to store minimum elements
    private Stack<Integer> minStack;

    /** initialize your data structure here. */
    public static MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        // Push the element onto the main stack
        stack.push(x);

        // If the minStack is empty or the current element is less than or equal to the current minimum,
        // push the element onto the minStack
        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }

    public void pop() {
        // Pop the element from the main stack
        int poppedElement = stack.pop();

        // If the popped element is equal to the current minimum, pop from minStack as well
        if (poppedElement == minStack.peek()) {
            minStack.pop();
        }
    }

    public int top() {
        // Return the top element from the main stack
        return stack.peek();
    }

    public int getMin() {
        // Return the current minimum element from the minStack
        return minStack.peek();
    }
}