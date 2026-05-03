package com.yana.recursion;

public class digitsum {
    public static void main(String[] args) {
        int ans = sum(1234);
        System.out.println(ans);

    }

    static int sum(int n) {
      if (n == 0) {
          return 0;
      }
      // % 10 gives last digit / removes last digit
    return (n%10) * sum(n/10);
    }
}

