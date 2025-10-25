import java.util.*;
public class BucketSort {
    public static void bucketSort(int[] nums) {
        if (nums.length == 0)
            return;
        int max = nums[0];
        for (int num : nums) {
            if (num > max)
                max = num;
        }

        int[] bucket = new int[max + 1];

        for (int num : nums) {
            bucket[num]++;
        }

        int index = 0;
        for (int i = 0; i < bucket.length; i++) {
            while (bucket[i] > 0) {
                nums[index++] = i;
                bucket[i]--;
            }
        }
    }
}
