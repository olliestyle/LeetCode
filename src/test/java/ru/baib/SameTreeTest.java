package ru.baib;

import org.junit.Test;

import static org.junit.Assert.*;

public class SameTreeTest {

    @Test
    public void test1() {
        TreeNode rootQ = new TreeNode(1 , new TreeNode(2), new TreeNode(3));
        TreeNode rootP = new TreeNode(1 , new TreeNode(2), new TreeNode(3));
        assertTrue(SameTree.isSameTree(rootP, rootQ));
    }

    @Test
    public void test2() {
        TreeNode rootQ = new TreeNode(1 , new TreeNode(2), new TreeNode(3));
        TreeNode rootP = new TreeNode(1 , new TreeNode(2), null);
        assertFalse(SameTree.isSameTree(rootP, rootQ));
    }
}