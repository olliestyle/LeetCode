package ru.baib;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static int majority(int[] nums) {
        int res = 0;
        int lol = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if (entry.getValue() > lol) {
                lol = entry.getValue();
                res = entry.getKey();
            }
        }
        return res;
    }
}
