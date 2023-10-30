//Triplet sum in Array
import java.util.*;
class Java155
{
    public static void main(String[] args) {
        int[] sum = {1,4,45,6,10,8};
        boolean ans = findTripletsum(sum, 6, 22);
        System.out.println(ans);
    }
    public static boolean findTripletsum(int[] A, int n, int X)
    {
        for(int i=0; i<n-2; i++)
        {
            HashSet<Integer> set = new HashSet<>();
            int toFind = X-A[i];
            for(int j=i+1; j<n; j++)
            {
                if(set.contains(toFind-A[j]))
                {
                    return true;
                }
                set.add(A[j]);
            }
        }
        return false;
    }
}