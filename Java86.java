//Factorial of the large Number
import java.util.LinkedList;
public class Java86 {
    public static LinkedList<Integer> calculateFactorial(int n) {
        LinkedList<Integer> result = new LinkedList<>();
        result.add(1); // Initialize with 1

        for (int i = 2; i <= n; i++) {
            multiply(result, i);
        }

        return result;
    }

    private static void multiply(LinkedList<Integer> list, int num) {
        int carry = 0;

        for (int i = 0; i < list.size(); i++) {
            int product = list.get(i) * num + carry;
            list.set(i, product % 10);
            carry = product / 10;
        }

        while (carry != 0) {
            list.add(carry % 10);
            carry /= 10;
        }
    }
    public static void main(String[] args) {
        int n = 200; // Change this to the desired value
        LinkedList<Integer> factorial = calculateFactorial(n);

        System.out.println("Factorial of " + n + " is:");
        for (int digit : factorial) {
            System.out.print(digit);
        }
    }
}
