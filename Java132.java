//Letter Combinations of a Phone Number
import java.util.ArrayList;
import java.util.List;
class Java132
{
    public static void main(String[] args) {
        String digits = "23"; // Example input, change it as needed.
        List<String> combinations = letterCombinations(digits);
        
        System.out.println("Letter Combinations for " + digits + ":");
        for (String combination : combinations) {
            System.out.println(combination);
        }
    }
    public static List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return combinations;
        }
        
        String[] phoneMap = {
            "0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
        };
        
        backtrack(combinations, phoneMap, digits, 0, new StringBuilder());
        return combinations;
    }

    private static void backtrack(List<String> combinations, String[] phoneMap, String digits, int index, StringBuilder current) {
        if (index == digits.length()) {
            combinations.add(current.toString());
            return;
        }
        
        int digit = digits.charAt(index) - '0';
        String letters = phoneMap[digit];
        
        for (char letter : letters.toCharArray()) {
            current.append(letter);
            backtrack(combinations, phoneMap, digits, index + 1, current);
            current.deleteCharAt(current.length() - 1); // Backtrack by removing the last character
        }
    }
}