package com.myjava.forthWeek;

// Implement atoi to convert a string to an integer.
// 注意：考虑特殊情况，比如：
//1.该函数首先丢弃尽可能多的空格字符，直到找到第一个非空格字符。 然后，从该字符开始，选择一个可选的初始加号或减号，后跟尽可能多的数字，并将其解释为数值
//2.该字符串可以包含形成整数之后的其他字符，这些字符将被忽略，并且不影响此函数的行为。
//3.如果str中的第一个非空白字符序列不是有效的整数，或者由于str为空或仅包含空格字符，否则不存在此类序列，则不进行转换。 ！！！
//4.如果不能执行有效的转换，则返回零值。如果正确的值超出可表示值的范围，则返回INT_MAX（2147483647）或INT_MIN（-2147483648）

public class LC8_13 {
    // MyAtoi String to Integer (atoi)
    public int myAtoi(String str){
        if (str == null) {
            return 0;
        }
        str = str.trim();  // 去掉空格
        if (str.length()==0){
            return 0;
        }

        int sign=1;
        int index=0;
        if (str.charAt(index) == '+') {
            index++;
        } else if (str.charAt(index) == '-') {
            sign=-1;
            index++;
        }
        long num = 0;

        for(;index<str.length();index++) {
            if (str.charAt(index) < '0' || str.charAt(index) > '9') {
                break;
            }
            // 核心 !!! 将数字存到一个变量里面
            num = num * 10 + (str.charAt(index) - '0');
            if (num>Integer.MAX_VALUE)
                break;
        }
        if (num*sign>=Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        if (num*sign<=Integer.MIN_VALUE)
            return Integer.MIN_VALUE;

        return (int) num * sign;
    }
}
