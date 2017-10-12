package com.myjava.forthWeek;

public class LC8_13_1 {
    // IsPalindrome Palindrome Number
    public boolean isPalindrome(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }
        // 思路和反转数字一样
        int res = 0;
        while (x > res) {
            res = res * 10 + x % 10;
            x /= 10;
        }
        return (res == x || res / 10 == x);
    }
}
