package com.myjava.eighthweek;

import java.util.HashMap;

public class LC9_6_2 {
    // Roman to Integer
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int len = s.length();
        int value = map.get(s.charAt(len - 1));
        // 从末端倒序更容易理解
        for (int i = len - 2; i >= 0; i--) {
            if (map.get(s.charAt(i)) >= map.get(s.charAt(i + 1))) {
                value += map.get(s.charAt(i));
            } else {
                value -= map.get(s.charAt(i));
            }
        }
        return value;
    }
}
