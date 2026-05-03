package com.yana.binary_search;
// find position of an element in a sorted array of infinite numbers...

public class gfg_question_bs {

    static int ans(int[] arr, int target) {
        // first find the range
        // first start with a box of size 2

        int start = 0;
        int end = 1;

        // condition for the target to lie in the range
        while (target > arr[end]) {
            int newStart = end + 1;

            // double the box value
            // end = previous end + size of box * 2
            end = end + (end - start + 1) * 2;
            start = newStart;
        }

        return gfg_question_bs(arr, target, start, end);
    }

    static int gfg_question_bs(int[] arr, int target, int start, int end) {

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] > target) {
                end = mid - 1;
            }
            else if (arr[mid] < target) {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
