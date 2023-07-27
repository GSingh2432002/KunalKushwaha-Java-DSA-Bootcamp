//Arrays of Object
import java.util.Scanner;
import java.util.Arrays;
class Java37
{
    public static void main(String[] args) {
         Scanner obj = new Scanner(System.in);
        
         //Array of Primitive
         int[] arr = new int[5];
         arr[0] = 21;
         arr[1] = 22;
         arr[2] = 23;
         arr[3] = 24;
         arr[4] = 25;
         System.out.println(arr[3]);

         //Array of Objects
         String[] str = new String[4];
         for (int i = 0; i < str.length; i++ )
         {
            str[i] = obj.next();
         }
         System.out.println(Arrays.toString(str)); 
    }
}