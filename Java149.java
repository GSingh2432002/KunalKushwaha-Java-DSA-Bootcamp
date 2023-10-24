//Smallest Index With Equal Value
import java.util.*;
class Java149
{
    public static void main(String[] args) {
        
    }
    public static int smallestEqual(int[] nums)
    {
        for(int i=0; i<nums.length; ++i)
        {
            if(i%10 == nums[i])
            {
                return i;
            }
        }
        return -1;
    }
}