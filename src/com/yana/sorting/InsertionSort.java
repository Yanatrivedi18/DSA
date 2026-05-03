package com.yana.sorting;

public class InsertionSort {

    public static void main(String[] args) {

        int arr[] = {5, 1, 4, 2, 8};
        int n = arr.length;

        for (int i = 1; i < n; i++) {

            int key = arr[i];      // element to be inserted
            int j = i - 1;

            // Move elements greater than key one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            arr[j + 1] = key;  // place key at correct position
        }

        // Print sorted array
        System.out.println("Sorted Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}