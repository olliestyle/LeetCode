package ru.baib;

public class ImplementStrStr {
    public static int strStr(String haystack, String needle) {
        int res = -1;
        if (haystack.contains(needle)) {
            res = haystack.indexOf(needle);
        } else if (needle.length() == 0) {
            res = 0;
        }
//        if (haystack.length() > needle.length()) {
//            res = -1;
//            for(int i = 0; i < haystack.length() - needle.length(); i++) {
//                if (haystack.substring(i, i + needle.length()).equals(needle)) {
//                    res = i;
//                    break;
//                }
//            }
//        } else if (haystack.equals(needle) || needle.length() == 0) {
//            res = 0;
//        } else {
//            res = -1;
//        }
        return res;
    }
}
