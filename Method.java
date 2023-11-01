//About Methods
import java.util.Arrays;
class Method
{
    public static void main(String[] args) {
        String name = "Gaurav Singh from UEM Kolkata";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name);
        System.out.println(name.indexOf(name));
        System.out.println("   Gaurav      ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}