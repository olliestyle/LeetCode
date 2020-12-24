package ru.baib;

/**
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Plus One.
 * Memory Usage: 37.6 MB, less than 49.78% of Java online submissions for Plus One.
 */
public class PlusOne {
    public static int[] plusOne(int[] digits) {
        boolean end = false;
        if (digits[digits.length - 1] != 9) {
            digits[digits.length - 1]++;
            return digits;
        } else {
            for (int i = digits.length - 1; i >= 0; i--) {
                if (i == 0 && digits[i] == 9) {
                    end = true;
                }
                if (digits[i] == 9) {
                    digits[i] = 0;
                } else {
                    digits[i]++;
                    break;
                }
            }
        }
        if (end) {
            int[] res = new int[digits.length + 1];
            res[0] = 1;
            for (int i = 1; i < digits.length; i++) {
                res[i] = 0;
            }
            return res;
        }
        return digits;
    }
}
