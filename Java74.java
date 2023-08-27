//Cyclic Rotated Array
import java.util.Arrays;
import java.util.Scanner;

public class Java74 {
    static void reverse(int[] nums, int low, int high) {
        while (low < high) {
            int temp = nums[low];
            nums[low] = nums[high];
            nums[high] = temp;
            low++;
            high--;
        }
    }
    static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(nums, 0, n - k - 1);
        reverse(nums, n - k, n - 1);
        reverse(nums, 0, n - 1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int n = scanner.nextInt();
        System.out.print("Enter Steps: ");
        int k = scanner.nextInt();
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element no " + (i + 1) + "-> ");
            arr[i] = scanner.nextInt();
        }

        rotate(arr, k);
        
        System.out.print("Rotated Array -> [ ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }
}