package com.leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class NO0652 {
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

    HashMap<String, Integer> memory = new HashMap<>();
    List<TreeNode> res = new ArrayList<>();
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        traverse(root);
        return res;
    }
    public String traverse(TreeNode root){
        if(root == null){
            return "#";
        }
        String left = traverse(root.left);
        String right = traverse(root.right);
        String result = left + "," + right + "," + root.val;
        int times = memory.getOrDefault(result, 0);
        if(times == 1){
            res.add(root);
        }
        memory.put(result, times + 1);
        return result;
    }
}
