//Common elements in all rows of a given matrix
import java.util.*;
class Java111
{
    public static void main(String[] args) {
        int mat[][] = {
            {1,2,1,4,8},
            {8,7,8,5,1},
            {8,7,7,3,1},
            {8,1,2,7,9}
        };
        commonElement(mat, 4, 5);
    }
    public static void commonElement(int Mat[][], int r, int c)
    {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<c;i++)
        {
            map.put(Mat[0][i],1);
        }
        for(int i=1;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(map.containsKey(Mat[i][j]) && map.get(Mat[i][j])==i)
                {
                    map.put(Mat[i][j], map.get(Mat[i][j])+1);
                }

                if(i==r && map.containsKey(Mat[i][j]) && map.get(Mat[i][j])==r)
                {
                    System.out.println(Mat[i][j]);
                }
            }
        }
    }
}