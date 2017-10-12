package com.myjava.forthWeek;
// Reverse Integer
public class LC8_12 {
    public int reverse(int x) {
        int res = 0;
        while (x != 0) {
            int temp = x % 10;
            int newRes = res * 10 + temp;
            if((newRes-temp)/10 != res){
                return 0;
            }
            res = newRes;
            x /= 10;
        }

        return res;
    }
}
