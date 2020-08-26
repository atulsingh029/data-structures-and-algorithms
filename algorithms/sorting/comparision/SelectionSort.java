package algorithms.sorting.comparision;

/*
Theory:
    
*/

import java.util.Arrays;
public class SelectionSort {
    int[] array;

    public SelectionSort(int[] array){
        this.array = array;
    }

    private void swap(int min , int pointer){
        int temp = array[min];
        array[min] = array[pointer];
        array[pointer] = temp;
    }

    private int min(int pointer){
        try {
            int minI = pointer+1;
            int min = array[pointer + 1];
            for (int i = pointer + 1; i < array.length; i++) {
                if (array[i] < min) {
                    min = array[i];
                    minI = i;
                }
            }
            return minI;
        }
        catch (ArrayIndexOutOfBoundsException e){
            return pointer;
        }
    }

    public void selectionSort(){
        int min;
        for (int i = 0; i < array.length ; i++) {
            min = min(i);
            if(array[min]<array[i]){ swap(min,i);}
        }
    }

    public static void main(String[] args) {
        int[] arr= {6,7,6,2,4,9,73,6,48,0};
        SelectionSort ss = new SelectionSort(arr);
        ss.selectionSort();
        System.out.println(Arrays.toString(arr));
    }
}
