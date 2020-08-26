package algorithms.sorting.comparision;

import java.util.Arrays;

public class QuickSort {
    int[] array;

    public QuickSort(int[] array){
        this.array = array;
    }

    public void quickSort(){
        qsort(this.array,0,this.array.length-1);
    }
    int partition(int[] arr, int low, int high)
    {
        int pivot = arr[high];
        int i = (low-1);
        for (int j=low; j<high; j++)
        {
            if (arr[j] < pivot)
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }

    void qsort(int[] arr, int low, int high)
    {
        if (low < high)
        {
            int pi = partition(arr, low, high);
            qsort(arr, low, pi-1);
            qsort(arr, pi+1, high);
        }
    }

    public static void main(String[] args) {
        int[] arr= {6,7,2,4,9,73,6,48,0,13};
        QuickSort ss = new QuickSort(arr);
        ss.quickSort();
        System.out.println(Arrays.toString(arr));
    }
}


//complexity O(n2)