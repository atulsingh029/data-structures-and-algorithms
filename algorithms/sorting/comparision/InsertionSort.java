package algorithms.sorting.comparision;

import java.util.Arrays;

public class InsertionSort {
    int[] array;

    public InsertionSort(int[] array){
        this.array = array;
    }

    public void insertionSort(){
        for (int i = 1; i < this.array.length; i++) {
            int temp=this.array[i];
            int j=i-1;
            while(j>=0 && this.array[j]>temp){
                this.array[j+1]=this.array[j];
                j=j-1;
            }
            this.array[j+1]=temp;
        }
    }

    public static void main(String[] args) {
        int[] arr= {6,7,6,2,4,9,73,6,48,0};
        InsertionSort ss = new InsertionSort(arr);
        ss.insertionSort();
        System.out.println(Arrays.toString(arr));
    }
}
