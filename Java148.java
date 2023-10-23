//Find words that can be formed by characters
import java.util.*;
import java.util.Arrays;
class Java148
{
    public static void main(String[] args) {
        String[] words = {"cat", "bt", "hat", "tree"};
        String chars = "atach";
        System.out.println(countCharacters(words, chars));
    }
    public static int countCharacters(String[] words, String chars)
    {
        int good_word_lengths_sum = 0;
        int[] char_counts = new int[26];
        for(char c : chars.toCharArray())
        {
            char_counts[c-'a']++;
        }
        for (String word : words)
        {
            int[] temp_char_counts = Arrays.copyOf(char_counts, char_counts.length);
            int valid_char_count = 0;

            for(char c : word.toCharArray())
            {
                if(temp_char_counts[c-'a'] > 0)
                {
                    valid_char_count++;
                    temp_char_counts[c-'a']--;
                }
            }
            if(valid_char_count == word.length())
            {
                good_word_lengths_sum += word.length();
            }
        }
        return good_word_lengths_sum;
    }
}