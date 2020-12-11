package ru.baib;

import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        char[] ca = s.toCharArray();
        boolean res = false;
        Stack stack = new Stack();
        for (char c: ca) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (!stack.empty() && c == ')' && stack.peek().equals('(')) {
                stack.pop();
            } else if (!stack.empty() && c == '}' && stack.peek().equals('{')) {
                stack.pop();
            } else if (!stack.empty() && c == ']' && stack.peek().equals('[')) {
                stack.pop();
            } else {
                stack.push(c);
                break;
            }
        }
        if(stack.empty()) {
            res = true;
        }
        return res;
    }
}
