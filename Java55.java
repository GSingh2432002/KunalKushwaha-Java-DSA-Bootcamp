//Span of an Array
import java.util.Scanner;
class Java55
{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = obj.nextInt(); 
        }
        
        int max = arr[0];
        int min = arr[0];
        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }

            if(arr[i] < min)
            {
                min = arr[i];
            }
        }
        
        int span = max - min;
        System.out.println(span);
    }
}