//Array Subset of another array
import java.util.*;
import java.util.HashSet;
class Java91
{
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {3,4,5};
        if(subset(arr1, arr2))
        {
            if(subset(arr1, arr2))
            {
                System.out.println("arr2 is as subset of arr1");
            }
            else
            {
                System.out.println("arr2 is not a subset of arr1");
            }
        }
    }

    public static boolean subset(int[] arr1, int [] arr2)
    {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for(int element : arr1)
        {
            frequencyMap.put(element, frequencyMap.getOrDefault(element, 0)+ 1);
        }

        for(int element : arr2)
        {
            if(frequencyMap.containsKey(element))
            {
                int count = frequencyMap.get(element);
                if(count == 1)
                {
                    frequencyMap.remove(element);
                }
                else
                {
                    frequencyMap.put(element,count - 1);
                }
            }
            else{
                return false;
            }
        }
        return true;
    }
}