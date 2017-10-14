package com.myjava.october.secondweek;

import java.util.Stack;

public class LeetValidParentheses {
    // IsValid Valid Parentheses
    // 思路：由于是判断字符串是否对称，可以栈来设计，入栈和出栈来判断。很巧妙。
    public boolean isValide(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') stack.push(')');
            else if (c == '{') stack.push('}');
            else if (c == '[') stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }
}
