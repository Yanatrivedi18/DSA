package com.yana.binary_search;

public class twod_bs
{
    class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {
            int rows = matrix.length;
            int cols = matrix[0].length;

            int start = 0;
            int end = rows * cols - 1;

            while (start <= end) {
                int mid = start + (end - start) / 2;

                int r = mid / cols;
                int c = mid % cols;

                if (matrix[r][c] == target) {
                    return true;
                } else if (matrix[r][c] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            return false;
        }
    }

}


