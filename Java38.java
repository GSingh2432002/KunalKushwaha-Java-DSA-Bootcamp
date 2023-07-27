//Passing in Function
import java.util.Scanner;
import java.util.Arrays;
class Java38
{
    public static void main(String[] args) {
        int[] nums = {3,4,5,6,7};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] arr)
    {
        arr[0] = 10;
    }
}