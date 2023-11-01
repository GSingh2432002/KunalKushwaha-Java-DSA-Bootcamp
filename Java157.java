//Count Inversion
import java.util.*;
class Java157
{
    public static void main(String[] args) {
        long[] arr = {1,20,6,4,5};
        System.out.println("Number of inversions: "+inversionCount(arr,5));
    }
    public static long inversionCount(long arr[], long N)
    {
        return mergeSort(arr, 0,(int)(N-1));
    }
    public static long mergeSort(long arr[], int s, int f)
    {
        long counter = 0;
        if(s<f)
        {
            int m = s+(f-s)/2;
            counter += mergeSort(arr, s, m);
            counter += mergeSort(arr, m+1, f);
            counter += merge(arr,s,m,f);
        }
        return counter;
    }
    public static long merge(long arr[], int s, int m, int f)
    {
        long counter = 0;
        int n1 = (m-s+1);
        int n2 = (f-m);
        long L[] = new long[n1];
        long R[] = new long [n2];
        for(int i=0; i<n1; i++)
        {
            L[i] = arr[s+i];
        }
        for(int j=0; j<n2; j++)
        {
            R[j] = arr[m+1+j];
        }
        int i=0, j=0, k=s;
        while(i<n1 && j<n2)
        {
            if(L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                counter += (n1-i);
                j++;
            }
            k++;
        }
        while(i<n1)
        {
            arr[k++] = L[i++];
        }
        while(j<n2)
        {
            arr[k++] = R[j++];
        }
        return counter;
    }
}