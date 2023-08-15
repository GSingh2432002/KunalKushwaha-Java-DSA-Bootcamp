//Find the Kth Min and Max Element of an Array 
import java.util.Scanner;
import java.util.Arrays;
class Java59
{
    public static void main(String[] args) {
        int arr[] = {2,4,6,3,9,7}; //Array items
        int n = arr.length; //Size of Array
        int k = 4; //Given value 
        int x = KthLargestElement(arr,n,k);
        System.out.println("Kth largest element is : " + x);
    }
    static int KthLargestElement(int arr[], int n, int k)
    {
        Arrays.sort(arr);//sorting the array
        return arr[n - k];
    }
}