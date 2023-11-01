//About Operators
import java.util.ArrayList;
class Operators
{
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println((char)('a' + 3));
        System.out.println("a" + 1);
        System.out.println("a" + 1);
        System.out.println("Gaurav" + new ArrayList<>());
        System.out.println("Gaurav" + new Integer(56));
        String ans = new Integer(56) + " " + new ArrayList<>();
        System.out.println(ans);
    }
}