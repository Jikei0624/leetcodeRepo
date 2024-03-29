package com.leetcode.easy;

public class NO0543 {
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

    int maxDiameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        trverse(root);
        return maxDiameter;
    }

    public void trverse(TreeNode root){
        if(root == null){
            return;
        }
        int max = maxDepth(root.left) + maxDepth(root.right);
        maxDiameter = Math.max(maxDiameter, max);
        trverse(root.left);
        trverse(root.right);
    }

    public int maxDepth(TreeNode root){
        if(root == null){
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
