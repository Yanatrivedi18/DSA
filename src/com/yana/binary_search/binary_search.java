package com.yana.binary_search;

public class binary_search {
    public static void main(String[] args) {
        int [] arr={2,4,5,15,17,19};
        int ans = binary_search(arr,17);
        System.out.println(ans);

}

static int binary_search(int[] arr, int target) {
    int start = 0;
    int end = arr.length - 1;

    while (start <= end) {
        int mid = (start + end) / 2;

        if (target < arr[mid]) {
            end = mid - 1;
        } else if (target > arr[mid]) {
            start = mid + 1;
        } else {
            return mid;
        }

    }

    return -1;
}
}
