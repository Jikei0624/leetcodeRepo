package com.leetcode.medium;

public class NO0654 {
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


    public TreeNode constructMaximumBinaryTree(int[] nums) {
        TreeNode root = helper(nums, 0, nums.length - 1);
        return root;
    }
    public TreeNode helper(int[] nums, int low, int high){
        if(low > high){
            return null;
        }
        int index = -1, max = Integer.MIN_VALUE;
        for(int i = low; i <= high; i++){
            if(nums[i] > max){
                index = i;
                max = nums[i];
            }
        }
        TreeNode root = new TreeNode(max);
        root.left = helper(nums, low, index - 1);
        root.right = helper(nums, index + 1, high);
        return root;
    }
}
