package com.yana.recursion;

public class recursion_2 {
    public static void main(String[] args) {
        numrev(5);
        num(5);


    }

    static void num(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        num(n - 1);

    }

    static void numrev(int n) {
        if (n == 0) {
            return;
        }

        numrev(n - 1);
        System.out.println(n);

    }
}
