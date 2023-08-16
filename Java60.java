//Sort an Array of 0s, 1s and 2s
import java.util.Scanner;
import java.util.Arrays;
class Java59
{
    public static void main(String[] args) {
    int[] arr = {1,2,2,2,1,1,0,2,0};
    
    }

    static void sortColors(int[] nums) {
    int i = 0, count0 = 0, count1 = 0, count2 = 0;
    for (i = 0; i < nums.length; i++) {
      if (nums[i] == 0)
        count0++;
      else if (nums[i] == 1)
        count1++;
      else if (nums[i] == 2)
        count2++;
    }

    i = 0;

    while (count0 > 0) {
      nums[i++] = 0;
      count0--;
    }

    while (count1 > 0) {
      nums[i++] = 1;
      count1--;
    }

    while (count2 > 0) {
      nums[i++] = 2;
      count2--;
    }
  }
}
