//Palindromic Array
import java.io.*;
class Java99
{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,3,2,1};
        boolean palindrome = isPalindromeArray(arr);

        if(palindrome)
        {
            System.out.println("The array is a Palindrome");
        }
        else
        {
            System.out.println("The array is not a Palindrome");
        }
    }
    public static boolean isPalindromeArray(int[] arr)
    {
        int left = 0;
        int right = arr.length - 1;

        while(left < right)
        {
            if(arr[left] != arr[right])
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}