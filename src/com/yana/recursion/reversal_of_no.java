package com.yana.recursion;

public class reversal_of_no {
    public static void main(String[] args) {
    int ans = (1234);
    System.out.println(ans);

    }
    static int rev(int n){
        if(n==0){
            return 0;
        }
        return rev(n%10)+rev(n/10);
    }
}

