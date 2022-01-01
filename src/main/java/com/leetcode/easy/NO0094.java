package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class NO0094 {
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

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        recursion(root, res);
        return res;
    }

    public void recursion(TreeNode root, List<Integer> res){
        if (root == null){
            return;
        }
        recursion(root.left, res);
        res.add(root.val);
        recursion(root.right, res);
    }

}
