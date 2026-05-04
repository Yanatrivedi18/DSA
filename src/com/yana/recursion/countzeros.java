package com.yana.recursion;

public class countzeros {
    public static void main(String[] args) {
        int n = 102030405;
        System.out.println(count(n));

    }
    static int count(int n){
      if(n==0){
        return 0;
        }

        int digit = n%10;
      if(digit==0){
          return 1+  count(n/10);
      }
      else{
          return count(n/10);
      }


    }
}
