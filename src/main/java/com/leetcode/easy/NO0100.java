package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class NO0100 {
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

    /*
    出现测试用例问题：

    输入：
    [1,1]
    [1,null,1]
    输出：
    true
    预期结果：
    false

    该方法存在问题：没有比较其结构，只是比较其数字顺序，不符合题意！！！
     */

/*    public boolean isSameTree(TreeNode p, TreeNode q) {
        boolean res = false;
        List<Integer> plist = new ArrayList<>();
        List<Integer> qlist = new ArrayList<>();
        traverse(p, plist);
        traverse(q, qlist);
        if (plist.equals(qlist)){
            res = true;
        }
        return res;
    }

    public void traverse(TreeNode t, List<Integer> list){
        if (t == null){
            return;
        }
        traverse(t.left, list);
        list.add(t.val);
        traverse(t.right, list);
    }*/

    /*
    以下是简洁的正解，直接用递归比较其结构！
     */
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null) return q == null;
        return q != null && p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }


}
