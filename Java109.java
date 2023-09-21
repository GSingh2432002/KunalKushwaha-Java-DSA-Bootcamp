//Find Matrix Pair 
import java.util.HashMap;
import java.util.Map;
class Java109
{
    public static void main(String[] args) {
        
    }
    private int[] nums1;
    private int[] nums2;
    private Map<Integer, Integer> countMap;

    public void FindSumPairs(int[] nums1, int[] nums2) {
        this.nums1 = nums1;
        this.nums2 = nums2;
        this.countMap = new HashMap<>();

        for (int num : nums2) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
    }

    public void add(int index, int val) {
        int originalValue = nums2[index];
        nums2[index] += val;
        int newValue = nums2[index];

        countMap.put(originalValue, countMap.get(originalValue) - 1);
        countMap.put(newValue, countMap.getOrDefault(newValue, 0) + 1);
    }

    public int count(int tot) {
        int result = 0;

        for (int num : nums1) {
            int complement = tot - num;
            result += countMap.getOrDefault(complement, 0);
        }

        return result;
}
}