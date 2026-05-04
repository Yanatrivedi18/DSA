package com.yana.recursion;

public class lc_1342 {
    class Solution {
        public int numberOfSteps(int num) {
            return reduce(num);

        }
        static int reduce(int n){
            if(n==0){
                return 0;
            }
            if (n % 2 == 0){
                return 1+ reduce(n/2);
            }
            else {
                return 1+ reduce(n-1);
            }
        }
    }
}
