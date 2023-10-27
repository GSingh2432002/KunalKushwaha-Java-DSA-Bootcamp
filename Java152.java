//K-diff Pairs in an Array
import java.util.*;
class Java152
{
    public static void main(String[] args) {
        int[] nums = {3,1,4,1,5};
        int k = 2;
        int result = findPairs(nums, k);
        System.out.println(result);
    }
    public static int findPairs(int[] nums, int k)
    {
        Set<Integer> vis = new HashSet<>();
        Set<Integer> ans = new HashSet<>();
        for(int v : nums)
        {
            if(vis.contains(v-k))
            {
                ans.add(v-k);
            }
            if(vis.contains(v+k))
            {
                ans.add(v);
            }
            vis.add(v);
        }
        return ans.size();
    }
}