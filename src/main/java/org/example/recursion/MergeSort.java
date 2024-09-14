package org.example.recursion;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 2, 1};
       int ans[] =SortAndMerge(arr);
        for(int i:ans){
            System.out.println(i);
        }

    }

    private static int[] SortAndMerge(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int left[] = SortAndMerge(Arrays.copyOfRange(arr, 0, mid));
        int right[] = SortAndMerge(Arrays.copyOfRange(arr, mid, arr.length));
        return mergeArray(left, right);
    }

    private static int[] mergeArray(int[] left, int[] right) {
        int i = 0, k = 0, j = 0;
        int mix[] = new int[left.length + right.length];
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                mix[k] = left[i];
                i++;
            } else {
                mix[k] = right[j];
                j++;
            }
            k++;
        }
        while(i<left.length){
            mix[k]=left[i];
            i++;
            k++;
        }
        while(j<right.length){
            mix[k]=right[j];
            j++;
            k++;
        }
        return mix;
    }
}
