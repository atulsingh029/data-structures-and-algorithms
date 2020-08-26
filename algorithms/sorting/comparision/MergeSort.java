package algorithms.sorting.comparision;

import java.util.Arrays;

public class MergeSort {
    int[] array;

    public MergeSort(int[] array){
        this.array = array;
    }


    public void ms(int[] arr,int low,int high){
        if(low>=high)
            return;
        int mid=(low+high)/2;
        ms(arr, low, mid);
        ms(arr,mid+1,high);
        merge(arr,low,mid,high);
    }


    private void merge(int[] arr,int low,int mid,int high){
        int s=high+1;
        int[] crr=new int[s];
        int i=low,j=mid+1,k=0;
        while(i<=mid && j<=high) {
            if (arr[i] <= arr[j]) {
                crr[k] = arr[i];
                i += 1;
                k += 1;
            }
            else {
                crr[k] = arr[j];
                j += 1;
                k += 1;
            }
        }
        if(i<=mid){
        while(i<=mid) {
            crr[k] = arr[i];
            i += 1;
            k += 1;
        }
        }
        else{
            while(j<=high){
                crr[k]=arr[j];
                j+=1;
                k+=1;
            }
        }
        int p=0;
        for (int l = low; l <= high; l++) {
            arr[l]=crr[p];
            p=p+1;
        }
    }

    public void mergeSort(){
        ms(this.array,0,this.array.length-1);
    }

    public static void main(String[] args) {
        int[] arr= {6,7,6,2,4,9,-1,73,6,48,0};
        System.out.println("Input Array -> "+Arrays.toString(arr));
        MergeSort ss = new MergeSort(arr);
        ss.mergeSort();
        System.out.println("Output Array -> "+Arrays.toString(arr));
    }
}
