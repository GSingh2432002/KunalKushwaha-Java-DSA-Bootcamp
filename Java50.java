//Minimum Number
import java.util.Scanner;
class Java50
{
    public static void main(String[] args) {
        int[] arr = {111,23,34,45,56,67,78};
        System.out.println(min(arr));
    }
    static int min(int[] arr)
    {
        int ans = arr[0];
        for(int i=1; i<arr.length;i++)
        {
            if (arr[i] < ans)
            {
             ans = arr[i];
            }
         }
        return ans;
    }   
}