package com.myjava.sixthweek;

public class LC8_23 {
    public String convert(String s, int numRows) {
        if (numRows <= 1 || s.length() == 0) {
            return s;
        }
        String res = "";

        for (int i = 0; i < s.length() && i < numRows; i++) {
            int idx = i;
            res = res.concat(String.valueOf(s.charAt(idx)));

            for (int k = 1; idx < s.length(); k++) {
                // 第一行或最后一行
                if (i == 0 || i == numRows - 1) {
                    idx += 2 * numRows - 2;
                } else {
                    // 中间行
                    if ((k & 0x1) == 1) {  // 奇数位
                        idx += 2 * (numRows - 1 - i);
                    } else {
                        idx += 2 * i;
                    }
                }
                // 判断idx的合法性
                if (idx<s.length()){
                    res = res.concat(String.valueOf(s.charAt(idx)));
                }
            }
        }

        return res;
    }
}
