package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class NO0144 {
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
    List<Integer> res = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null){
            return res;
        }
        traverse(root);
        return res;
    }
    public void traverse(TreeNode root){
        if(root == null){
            return;
        }
        res.add(root.val);
        traverse(root.left);
        traverse(root.right);
    }
}
