package ru.baib;

/**
 * next stair always equal to sum of previous two cases.
 */

public class ClimbingStairs {
    public static int climb(int n) {
        if (n <= 3) {
            return n;
        }
        int res = 0;
        int k = 3;
        int a = 2;
        int b = 3;
        while (k < n) {
            res = a + b;
            a = b;
            b = res;
            k++;
        }
        return res;
    }
}
