package algorithms.sorting.comparision;

import java.util.Arrays;

public class HeapSort {
    int[] array;

    public HeapSort(int[] array){
        this.array = array;
    }

    public void heapSort()
    {
        int n = array.length;
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(array, n, i);
        for (int i=n-1; i>0; i--)
        {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            heapify(array, i, 0);
        }
    }

    void heapify(int arr[], int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        if (l < n && arr[l] > arr[largest]) largest = l;
        if (r < n && arr[r] > arr[largest]) largest = r;
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heapify(arr, n, largest);
        }
    }

    public static void main(String[] args) {
        int[] arr= {6,7,6,2,4,9,73,6,48,0};
        HeapSort ss = new HeapSort(arr);
        ss.heapSort();
        System.out.println(Arrays.toString(arr));
    }
}
