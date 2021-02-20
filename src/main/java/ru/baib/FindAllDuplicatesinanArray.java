package ru.baib;

import java.util.*;

/**
 * Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array),
 * some elements appear twice and others appear once.
 * Find all the elements that appear twice in this array.
 */

public class FindAllDuplicatesinanArray {
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for(int n: nums) {
            if (!set.contains(n)) {
                set.add(n);
            } else {
                res.add(n);
            }
        }
        return res;
    }

    public static List<Integer> findDuplicatesLeet(int[] nums) {
        List <Integer> result  =  new ArrayList<>();

        boolean[] x= new boolean[nums.length+1];

        for(int i = 0 ;  i < nums.length;i++){
            if(x[nums[i]]){
                result.add(nums[i]);
            }else{
                x[nums[i]]=true;
            }
        }

        return result;
    }
}
