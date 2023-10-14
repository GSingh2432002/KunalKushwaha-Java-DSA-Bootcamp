//Top K frequents Words
import java.util.*;
class Java139
{
    public static void main(String[] args) {
        String[] words = {"i", "love", "leetcode", "i", "love", "coding"};
        int k = 2;
        List<String> result = topKFrequent(words,k);
        System.out.println(result);

    }
    public static List<String> topKFrequent(String[] words, int k)
    {
         // Create a map to store word frequencies
         Map<String, Integer> wordFreq = new HashMap<>();
         for (String word : words) {
             wordFreq.put(word, wordFreq.getOrDefault(word, 0) + 1);
         }
 
         // Create a PriorityQueue to store words based on frequency
         PriorityQueue<String> pq = new PriorityQueue<>(
             (word1, word2) -> {
                 int freq1 = wordFreq.get(word1);
                 int freq2 = wordFreq.get(word2);
                 if (freq1 != freq2) {
                     return freq2 - freq1; // Sort by frequency in descending order
                 } else {
                     return word1.compareTo(word2); // If frequencies are the same, sort lexicographically
                 }
             }
         );
 
         // Add all words to the priority queue
         for (String word : wordFreq.keySet()) {
             pq.add(word);
         }
 
         // Get the top k frequent words from the priority queue
         List<String> result = new ArrayList<>();
         for (int i = 0; i < k; i++) {
             result.add(pq.poll());
         }
 
         return result;
    }
}