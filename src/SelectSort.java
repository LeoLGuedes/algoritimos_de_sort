public class SelectSort {
    public static void selectionSort(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {
            int menor = i;

            for(int j = menor + 1; j < nums.length; j++) {
                if(nums[menor] > nums[j]) {
                    menor = j;
                }
                if(menor != i) {
                    int temp = nums[i];
                    nums[i] = nums[menor];
                    nums[menor] = temp;
                }
            }
        }
    }
}
