//Rotate Array
//Not yet done
import java.util.*;
class Java74
{
    public static void main(String[] args) {
        //Array to rotate
        int[] nums = {12, -9, 111, 23, -99, 67, 98, 90, 11, 45};
        //numbers of rotations to be performed
        //we can change the number of rotations accordingly
        int r = 1;
        //determines the length of array
        int n = nums.length;
        System.out.println("Array before rotation: ");
        for(int i = 0; i<n; i++)
        {
            System.out.print(nums[i]+ " ");
        }
        System.out.println();
        rotate(nums,r,n);
        System.out.println("Array after rotation: ");
        for(int i=1; i<n;i++)
        {
            System.out.print(nums[i]+" ");
        }
    }
    public static void rotate(int[] nums, int k, int n) {
        for(int i = 0; i<k; i++)

        reverseArray(nums,n);
    }
    public static void  reverseArray(int[] nums,int n)
    {
        int i, temp;
        temp = nums[n-1];
        for(i=n-1;i>0;i--)
        nums[i] = nums[i-1];
        nums[0] = temp;
    }
}