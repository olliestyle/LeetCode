package ru.baib;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String... strs) {
        String res;
        int count = 1;
        int indexMin = 0;
        boolean in = true;
        if (strs.length == 0) {
            res = "";
        } else if (strs.length == 1) {
            res = strs[0];
        } else {
            int strLength = strs[0].length();
            for (int i = 0; i < strs.length; i++) {
                if (strs[i].length() < strLength) {
                    strLength = strs[i].length();
                    indexMin = i;
                }
            }
            for (int j = 0; j < strLength; j++) {
                if (in) {
                    for (int i = 0; i < strs.length - 1; i++) {
                        if (strs[i].charAt(j) != strs[i + 1].charAt(j)) {
                            count = j;
                            in = false;
                            break;
                        }
                    }
                }
            }
            if (strLength == 0) {
                res = "";
            } else if (!in) {
                res = strs[indexMin].substring(0, count);
            } else {
                return strs[indexMin];
            }
        }
        return res;
    }
}
