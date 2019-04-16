package com.clouway;

public class ArrayQuickSort {
    /**
     * QuickSort algorithm
     * @param arr array that is getting sorted
     * @param begin beginning of the section getting sorted
     * @param end end of the section getting sorted
     */
    public void sort(int[] arr, int begin, int end) {

        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);
            sort(arr, begin, partitionIndex - 1);
            sort(arr, partitionIndex + 1, end);
        }
    }

    /**
     * Function used by QuickSort to move variables left of the pivot
     * @param arr array that is getting sorted
     * @param begin left variable
     * @param end pivot
     * @return next partitionIndex
     */
    private int partition(int[] arr, int begin, int end) {
        int pivot = arr[end];
        int i = (begin - 1);

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;
                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }
        int swapTemp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = swapTemp;
        return i + 1;
    }
}
