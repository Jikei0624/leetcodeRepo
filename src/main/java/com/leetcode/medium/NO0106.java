package com.leetcode.medium;

public class NO0106 {
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

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder.length == 0 || postorder.length == 0){
            return null;
        }
        return helper(inorder, 0, inorder.length - 1,
                postorder, 0, postorder.length - 1);
    }
    public TreeNode helper(int[] inorder, int inStart, int inEnd,
                           int[] postorder, int postStart, int postEnd){
        if(inStart > inEnd || postStart > postEnd){
            return null;
        }
        int rootVal = postorder[postEnd];
        int index = 0;
        for(int i = inStart; i <= inEnd; i++){
            if(inorder[i] == rootVal){
                index = i;
                break;
            }
        }
        int leftSize = index - inStart;
        TreeNode root = new TreeNode(rootVal);
        root.left = helper(inorder, inStart, index - 1,
                postorder, postStart, postStart + leftSize - 1);
        root.right = helper(inorder, index + 1, inEnd,
                postorder, postStart + leftSize, postEnd - 1);
        return root;
    }
}
