package org.example.sorting;

public class QuickSortPivotAsFirst {
    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 2, 1};
        quickSort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    private static void quickSort(int[] arr, int low, int hi) {
        if (low >= hi) {
            return;
        }

        int pivotIndex = partition(arr, low, hi);
        quickSort(arr, low, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, hi);
    }

    private static int partition(int[] arr, int low, int hi) {
        int pivot = arr[low];
        int start = low + 1;
        int end = hi;

        while (start <= end) {
            while (start <= hi && arr[start] <= pivot) {
                start++;
            }
            while (end >= low && arr[end] > pivot) {
                end--;
            }
            if (start < end) {
                swap(arr, start, end);
            }
        }

        swap(arr, low, end);
        return end;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
