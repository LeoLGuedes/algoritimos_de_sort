public class combSort {
    public static void combSort(int[] arr) {
        int n = arr.length;
        int gap = n;
        double shrink = 1.3;
        boolean troca = true;

        while (gap > 1 || troca) {
            gap = (int) (gap / shrink);
            if (gap < 1) {
                gap = 1;
            }

            troca = false;

            for (int i = 0; i + gap < n; i++) {
                if (arr[i] > arr[i + gap]) {
                    int temp = arr[i];
                    arr[i] = arr[i + gap];
                    arr[i + gap] = temp;
                    troca = true;
                }
            }
        }
    }
}
