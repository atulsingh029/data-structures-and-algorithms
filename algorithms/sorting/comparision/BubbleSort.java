package algorithms.sorting.comparision;

import java.util.Arrays;

public class BubbleSort {
        public static int[] bubbleSort(int[] arr) {
            for (int i = arr.length - 1; i > 0; i--) {
                int temp;
                int swap = 0;
                for (int j = 0; j < i; j++) {
                    if (arr[j] > arr[j + 1]) {
                        temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        swap += 1;
                    }
                }
                if (swap == 0) {
                    break;
                }
            }
            return arr;
        }

    public static void main(String[] args) {
        int[] arr = {2,9,8,6,7,3,5,4,6,};
        arr = bubbleSort(arr);
        System.out.println("Sorted Array: "+ Arrays.toString(arr));
    }
}
