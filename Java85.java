//Bubble Sort
import java.util.Scanner;
import java.util.*;
class Java85
{
    public static void main(String[] args) {
        int[] arr = {-1,7,-32,0,89};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[] arr)
    {
        boolean swapped;
        //run the steps n-1 times
        for(int i = 0; i < arr.length; i++)
        {
            swapped = false;
            
            for(int j = 1; j < arr.length - i; j++)
            {
                if (arr[j] < arr[j-1])
                {
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped = true;
                }
            }
            if (!swapped)
            {
                break;
            }            
        }
    }
}