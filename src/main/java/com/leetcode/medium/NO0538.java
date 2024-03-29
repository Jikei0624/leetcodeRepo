package com.leetcode.medium;

public class NO0538 {
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

    int sum = 0;
    public TreeNode convertBST(TreeNode root) {
        traverse(root);
        return root;
    }
    public void traverse(TreeNode root){
        if(root == null){
            return;
        }
        traverse(root.right);
        sum += root.val;
        root.val = sum;
        traverse(root.left);


    }
}
