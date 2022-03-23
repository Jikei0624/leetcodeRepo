package com.leetcode.easy;

public class NO0700 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {
        }
        TreeNode(int val) {
            this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null) return null;
        if(root.val == val) return root;
        TreeNode res = null;
        if(root.val > val) res = searchBST(root.left, val);
        if(root.val < val) res = searchBST(root.right, val);
        return res;
    }
}
