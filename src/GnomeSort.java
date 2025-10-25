public class GnomeSort {
    public static void gnomeSort(int[] nums) {
        int i = 0;
        while(i < nums.length){
            if(i==0 || nums[i-1] <= nums[i]) {i++;}
            else{
                int temp = nums[i-1];
                nums[i - 1] = nums[i];
                nums[i] = temp;
                i--;
            }
        }
    }
}
