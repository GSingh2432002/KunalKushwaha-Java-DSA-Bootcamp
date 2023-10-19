//Group Anagram
import java.util.*;
class Java144
{
    public static void main(String[] args) {
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = groupAnagramsCategorizeFrequency(input);

        for (List<String> group : result) {
            System.out.println(group);
        }
    }
    public static List<List<String>> groupAnagramsCategorizeFrequency(String[] strs)
    {
        if(strs == null || strs.length == 0)
        return new ArrayList<>();

        Map<String, List<String>> frequencyStringMap = new HashMap<>();
        for(String str : strs)
        {
            String frequencyString = getFrequencyString(str);

            if(frequencyStringMap.containsKey(frequencyString))
            {
                frequencyStringMap.get(frequencyString).add(str);
            }
            else
            {
                List<String> strList = new ArrayList<>();
                strList.add(str);
                frequencyStringMap.put(frequencyString,strList);
            }
        }
        return new ArrayList<>(frequencyStringMap.values());
    }
    private static String getFrequencyString(String str)
    {
        int[] freq = new int[26];

        for(char c : str.toCharArray())
        {
            freq[c - 'a']++;
        }

        StringBuilder frequencyString = new StringBuilder("");
        char c = 'a';
        for(int i : freq)
        {
            frequencyString.append(c);
            frequencyString.append(i);
            c++;
        }
        return frequencyString.toString();
    }
}