package com.leetcode.medium;

public class NO0105 {
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

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length == 0 || inorder.length == 0){
            return null;
        }
        TreeNode root = helper(preorder, 0, preorder.length-1,
                inorder, 0, inorder.length-1);
        return root;
    }

    public TreeNode helper(int[] preorder, int lowP, int highP,
                           int[] inorder, int lowI, int highI){
        if(lowP > highP || lowI > highI){
            return null;
        }
        TreeNode root = new TreeNode(preorder[lowP]);
        int index = 0;
        for(int i = lowI; i <= highI; i++){
            if(preorder[lowP] == inorder[i]){
                index = i;
                break;
            }
        }
        int leftSize = index - lowI;
        root.left = helper(preorder, lowP + 1, lowP + leftSize,
                inorder, lowI, index - 1);
        root.right = helper(preorder, lowP + leftSize + 1, highP,
                inorder, index + 1, highI);

        return root;
    }
}
