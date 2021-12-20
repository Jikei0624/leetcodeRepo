package com.leetcode.easy;

public class NO0021 {
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode(-1);
        ListNode pointer = result;
        while (list1 != null && list2 != null){
            if (list1.val <= list2.val){
                pointer.next = list1;
                list1 = list1.next;
            } else {
                pointer.next = list2;
                list2 = list2.next;
            }
            pointer = pointer.next;
        }
        pointer.next = list1 == null ? list2 : list1;
        return result.next;
    }
}
