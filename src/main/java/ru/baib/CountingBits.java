package ru.baib;

/**
 * 0 -> 0 -> 0
 * 1 -> 1 -> 1
 * 2 -> 10 -> 1
 * 3 -> 11 -> 2 we can right shift 1 to get 1, and check 3 % 2 = 1, so we have 1 + 1 = 2 ones
 * 4 -> 100 -> 1 we can right shift 1 to get 10, and check 4 % 2 = 0, so we have 1 + 0 = 1 ones
 */

public class CountingBits {
    public static int[] countBits(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
            dp[i] = dp[i >> 1] + (i % 2);
        }
        return dp;
    }

    public static int[] mySol(int n) {
        int[] array = new int[n+1];
        for (int i = 0; i <= n; i++) {
            array[i] = getOne(Integer.toBinaryString(i));
        }
        return array;
    }

    public static int getOne(String binary) {
        int count = 0;
        for (char ch : binary.toCharArray()) {
            if (Character.compare(ch, '1') == 0)
                count++;
        }
        return count;
    }
}
