//Variable Arguments
import java.util.Arrays;
class Java33{
    public static void main(String[] args) {
        // fun();
        // multiple(2, 45, "Gaurav" , "Rishab" , "Aman");
        demo(2,3);
        demo("Gaurav");
    }
        static void demo(int ...v)
        {
            System.out.println(Arrays.toString(v));
        }
        static void demo(String ...v)
        {
            System.out.println(Arrays.toString(v));
        }


    // static void multiple(int a, int b, String ...v )
    // {
    //     System.out.println(Arrays.toString(v)); 
    // }


    // static void fun(int ...v)
    // {
    //     System.out.println(Arrays.toString(v));
    // }
}