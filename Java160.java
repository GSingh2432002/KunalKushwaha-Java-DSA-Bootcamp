//Next Greater Element III
import java.util.*;
import java.util.Arrays;
class Java160
{
    public static void main(String[] args) {
        String n1 = "12";
        String n2 = "21";
        String n3 = "125641";
        System.out.println(nextGreaterElement(n1));
        System.out.println(nextGreaterElement(n2));
        System.out.println(nextGreaterElement(n3));
    }
    public static String nextGreaterElement(String str)
    {
        char[] arr = str.toCharArray(); 

        //find first fip
        int i = arr.length - 2;
        while(i>=0 && arr[i] >= arr[i+1])
        {
            i--;
        }
        if(i==-1)
        {
            return "-1";
        }
        //find just greater that ith index element
        int k = arr.length - 1;
        while(arr[i] > arr[k])
        {
            k--;
        }
        //swap from i and k
        char temp = arr[i];
        arr[i] = arr[k];
        arr[k] = temp;
        //concatenate from 0 to i index
        String res = "";
        for(int j=0; j<=i; j++)
        {
            res += arr[j];
        }
        //concatenate from k to i+1 index(reverse order)
        for(int j=arr.length-1; j>i; j--)
        {
            res += arr[j];
        }
        return res;
    }
}