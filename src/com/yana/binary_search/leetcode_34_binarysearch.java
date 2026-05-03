package com.yana.binary_search;
// leetcpde 34 Find First and Last Position of Element in Sorted Array
public class leetcode_34_binarysearch {
    class Solution {
        public int[] searchRange(int[] nums, int target) {
            int first = findfirst(nums,target);
            int last = findlast(nums, target);
            return new int[]{first,last};

        }

        private int findfirst(int arr[], int target){
            int start = 0;
            int end = arr.length-1;
            int ans=-1;
            while(start<=end){
                int mid = start+(end-start)/2;
                if (arr[mid]==target){
                    ans=mid;
                    end=mid-1;
                }
                else if(target<= arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            return ans;

        }
        private int findlast(int arr[], int target){
            int start = 0;
            int end = arr.length-1;
            int ans=-1;
            while(start<=end){
                int mid = start+(end-start)/2;
                if (arr[mid]==target){
                    ans=mid;
                    start=mid+1;
                }
                else if(target>= arr[mid]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }


            return ans;
        }
    }
}
