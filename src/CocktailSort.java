public class CocktailSort {
    public static void cocktailSort(int[] nums) {

        boolean troca = true;
        while (troca) {
            troca = false;
            for(int i = 0; i <= nums.length - 2; i++) {
                if(nums[i] > nums[i + 1]) {
                    int temp = nums[i+1];
                    nums[i + 1] = nums[i];
                    nums[i] = temp;
                    troca = true;
                }
            }
            if(!troca) {
                break;
            }
            troca = false;
            for(int i = nums.length - 2; i >= 0; i-- ) {
                if(nums[i] > nums[i + 1]){
                    int temp = nums[i+1];
                    nums[i+1] = nums[i];
                    nums[i] = temp;
                    troca = true;
                }
            }

        }

    }
}
