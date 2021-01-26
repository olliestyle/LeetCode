package ru.baib;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Same Tree.
 * Memory Usage: 36.4 MB, less than 49.23% of Java online submissions for Same Tree.
 */

public class SameTree {
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if (p == null || q == null) {
            return false;
        }

        if (p.val != q.val) {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
