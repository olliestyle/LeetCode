package ru.baib;

import java.util.HashSet;
import java.util.Set;

public class SingleNumber {
    public static int singleNumberXOR(int[] nums) {
        int n = 0;
        for (int i = 0; i < nums.length; i++) {
            n ^= nums[i];
        }
        return n;
    }

    public static int singleNumberSet(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int n: nums) {
            if(!set.contains(n)) {
                set.add(n);
            } else {
                set.remove(n);
            }
        }
        int res = 0;
        for(int s: set) {
            res = s;
        }
        return res;
    }
}
