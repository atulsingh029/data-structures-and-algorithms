package algorithms.sorting.noncomparision;

import java.util.Arrays;

public class CountingSort {
    int[] array;
    int[] output_array;

    public CountingSort(int[] array){
        this.array = array;
        this.output_array = new int[array.length];
    }
    //Max element of the array
    private int getMAx(int[] arr){
        int max = arr[0];
        for(int i : arr){
            if (max<i){
                max = i;
            }
        }
        return max;
    }

    public void countingSort(){
        int max = getMAx(this.array);
        //Creating count array
        int[] count_array = new int[max+1];
        for (int i: this.array) {
            count_array[i]++;
        }
        //Rebuilding the count array to get actual positions of element in output array
        for (int i = 1; i<count_array.length; i++){
            count_array[i] = count_array[i]+count_array[i-1];
        }
        //Building the output array
        for(int  i = this.array.length-1 ;i>=0; i--){
            this.output_array[--count_array[this.array[i]]] = this.array[i];
        }
        //Rebuilding the input array to produce sorted output
        for (int i=0; i<this.array.length; i++) {
            this.array[i] = this.output_array[i];
        }

    }


    public static void main(String[] args) {
        int[] arr= {6,7,2,4,1,73,6,48,0,13,13};
        System.out.println("Unsorted Array --> "+Arrays.toString(arr));
        CountingSort ss = new CountingSort(arr);
        ss.countingSort();
        System.out.println("Sorted Array --> "+Arrays.toString(arr));
    }
}
