//Jump Game II
import java.util.*;
class Java76
{
    public static void main(String[] args) {
        
    }
    public int jump(int[] nums)
    {
        int jump = 0;
        int pos = 0;
        int des = 0;

        for(int i = 0; i < nums.length; i++)
        {
        des = Math.max(des,nums[i] + i);
            if(pos==i)
            {
                pos = des;
                jump++;
            }
        }
        return jump;
    }
}