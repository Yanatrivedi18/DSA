package com.yana.binary_search;

public class OrderAgnostics {

    public static void main(String[] args) {

        // Descending order array
        int[] arr = {99, 88, 77, 66, 55, 44, 33, 22, 11};

        int target = 70;

        int ans = binarySearch(arr, target);

        System.out.println("Element found at index: " + ans);
    }

    static int binarySearch(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        // Check whether array is ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {

            int mid = start + (end - start) / 2;

            // If target found
            if (arr[mid] == target) {
                return mid;
            }

            // If array is ascending
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            // If array is descending
            else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        // If element not found
        return -1;

        // for ceiling of a number keep the whole code same just put return start instead of return -1
        //for floor of a number keep the whole code same just put return end instead of return -1
    }
}
