package com.leetcode.medium;

public class NO0002 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode result = new ListNode();
            //pointer
        ListNode pointer = result;
        int carry = 0;
        while (l1 != null || l2 != null){
            int l1Val = 0;
            int l2Val = 0;
            int sum = 0;

            if(l1 != null){
                l1Val = l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                l2Val = l2.val;
                l2 = l2.next;
            }
            sum = l1Val + l2Val + carry;
            pointer.next = new ListNode(sum % 10);
            pointer = pointer.next;
            carry = 0;
            if((sum / 10) >= 1) {
                carry = 1;
            }
        }
        if (carry == 1){
            pointer.next = new ListNode(carry);
        }
        return result.next;
    }
}
