//Find common elements In 3 sorted Arrays
import java.util.ArrayList;
import java.util.List;
class Java84
{
    public static void main(String[] args) {
        int[] arr1 = {1, 5, 10, 20, 40};
        int[] arr2 = {6, 7, 20, 80, 100};
        int[] arr3 = {3, 4, 15, 20, 30};

        List<Integer> commonElements = findcommonElements(arr1, arr2, arr3);

        System.out.println("Common Elements: " + commonElements);
    }
    public static ArrayList<Integer> findcommonElements(int A[], int B[], int C[])
    {
        ArrayList<Integer> commonElements = new ArrayList();
        int i = 0;
        int j=0;
        int k=0;
        while(i<A.length && j<B.length && j<C.length)
        {
            if(A[i]==B[j] && B[j]==C[k])
            {
                commonElements.add(A[i]);
                i++;j++;k++;
                // continue;
            }
            else if(B[j]<C[k])
            {
                j++;
            }
            else if(A[i]<C[k])
            {
                i++;
            }
            else
            {
                k++;
            }
        }
        return commonElements;
    }
}