package org.example.recursion;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[]= new int[] {7, 5, 10, 1} ;
        sortArray(arr,0,0);
        for (int i : arr) {
            System.out.println(i);
        }

    }

    private static void sortArray(int[] arr, int minIndex, int maxIndex) {
        if(arr.length==1){
            return;
        }
        int maximumIndex=findMaxIndex(arr,0,1,0);
        int minimumIndex=findMinIndex(arr,0,0,0);
        int temp=arr[maximumIndex];
        arr[maximumIndex]=arr[minimumIndex];
        arr[minimumIndex]=temp;
//        System.out.print(maximumIndex+" "+minimumIndex);
        sortArray(Arrays.copyOfRange(arr,0,arr.length-1),minimumIndex,maximumIndex);
    }

    private static int findMinIndex(int[] arr, int first, int second,int minimum) {
        if(arr.length-1==second){
            return minimum;
        }
        int current_max=arr[first] >arr[second] ? second :first;
        int mini=arr[first] >arr[second] ? second :first;
        minimum=arr[mini] > arr[minimum] ?minimum :mini;
        return findMinIndex(arr,++first,++second,minimum);
    }

    private static int findMaxIndex(int[] arr, int first, int second,int maximum) {
        if(arr.length-1==second){
            return maximum;
        }
//        System.out.print(first+" "+second);
        int maxi=arr[first] >arr[second] ? first :second;
        maximum=arr[maxi] > arr[maximum] ?maxi :maximum;
        return findMaxIndex(arr,++first,++second,maximum);
    }
}
