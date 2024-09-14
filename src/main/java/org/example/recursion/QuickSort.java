package org.example.recursion;

import java.util.Arrays;

import static java.util.Arrays.sort;

public class QuickSort {
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        Quicksort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void Quicksort(int[] arr, int low, int hi) {
        if(low>=hi){
            return;
        }
        int start=low;
        int end=hi;
        int m=start+(end-start)/2;
        int pivot=arr[m];
        while(start<=end){
            while(arr[start]<pivot){
                start++;
            }
            while(arr[end]>pivot){
                end--;
            }
            if(start<=end){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
        }
        Quicksort(arr,low,end);
        Quicksort(arr,start,hi);
    }
}
