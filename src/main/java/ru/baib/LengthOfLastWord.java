package ru.baib;

public class LengthOfLastWord {
    public static int lengthLong(String s) {
        String[] strs = s.split(" ");
        if(strs.length == 0) return 0;
        return strs[strs.length - 1].length();
    }

    public static int lengthLong2(String s) {
        char[] chars = s.toCharArray();
        int res = 0;
        int maxRes = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                res = 0;
            } else {
                res++;
                maxRes = res;
            }
        }
        return maxRes;
    }
}
