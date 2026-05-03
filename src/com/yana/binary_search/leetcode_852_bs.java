package com.yana.binary_search;
// peak index in mountain array
public class leetcode_852_bs {

    public static void main(String[] args) {

        leetcode_852_bs obj = new leetcode_852_bs();
        int[] arr = {1, 2, 3, 5, 4, 2};

        System.out.println(obj.peakIndexInMountainArray(arr));
    }

    public int peakIndexInMountainArray(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = (start + end) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}
