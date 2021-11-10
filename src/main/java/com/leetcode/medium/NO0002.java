package com.leetcode.medium;

public class NO0002 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

/*    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null || l2 == null){
            return null;
        }
        int l1Total = 0;
        int l2Total = 0;
        while (l1.next != null){
            l1Total += l1.val * 10;
            l1 = l1.next;
        }
        while (l2.next != null){
            l2Total += l2.val * 10;
            l2 = l2.next;
        }
        int total = l1Total + l2Total;
        do{
            ListNode listNode1 = new ListNode(total % 10, null);
            total /= 10;
            if(total > 0){
                ListNode listNode2 = new ListNode(total % 10, null);
                listNode1.next = listNode2;
            }
        } while ((total % 10) >= 10);
        ListNode finalListNode = new ListNode();
        return null;
    }*/

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 != null || l2 != null){
            ListNode result = new ListNode();
            do {
                
            } while (l1.next != null || l2.next != null);
        }
        return null;
    }
}
