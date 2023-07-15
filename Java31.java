//Changing Index value using methods in Arrays
import java.util.Arrays;
class Java31
{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums)
    {
        nums[0] = 10;
    }
}