//Find all duplicates in an array
import java.util.*;
class Java127
{
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 1, 1}; 
        List<Integer> duplicates = findDuplicates(arr);
        System.out.println("The duplicate number is: " + duplicates);
    }
    public static List<Integer> findDuplicates(int[] arr)
    {
        int i = 0;
        while(i < arr.length)
        {
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct])
            {
                swap(arr,i,correct);
            }
            else    
            {
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int index = 0; index < arr.length; index++)
        {
            if(arr[index] != index + 1)
            {
                ans.add(arr[index]);
            }
        }
        return ans;
    }
    static void swap(int[] arr, int first, int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}