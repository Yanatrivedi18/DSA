package com.yana.recursion;

public class productdigit {
    public static void main(String[] args) {
        int ans = prod(505);
        System.out.println(ans);
    }
    static int prod(int n){
        if(n<10){
            return n;
        }
        return (n%10) *prod(n/10);
    }
}
