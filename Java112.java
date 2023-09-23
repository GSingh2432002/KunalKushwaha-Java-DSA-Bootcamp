//Remove Duplicate Letters 
import java.util.Stack;
class Java112
{
    public static void main(String[] args) {
        String input1 = "bcabc";
        String input2 = "cbacdcbc";
        
        // System.out.println("Input: " + input1);
        System.out.println("Output: " + removeDuplicateLetters(input1));
        
        // System.out.println("Input: " + input2);
        System.out.println("Output: " + removeDuplicateLetters(input2));
    }
    public String removeDuplicateLetters(String s)
    {
        int[] count = new int[26];
        boolean[] visited = new boolean[26];
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        for (char c : s.toCharArray()) {
            count[c - 'a']--;

            if (visited[c - 'a']) {
                continue;
            }

            while (!stack.isEmpty() && c < stack.peek() && count[stack.peek() - 'a'] > 0) {
                visited[stack.pop() - 'a'] = false;
            }

            stack.push(c);
            visited[c - 'a'] = true;
        }

        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.insert(0, stack.pop());
        }

        return result.toString();
    }
}