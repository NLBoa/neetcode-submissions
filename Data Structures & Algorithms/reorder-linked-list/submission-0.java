/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public void reorderList(ListNode head) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy;

        int count = 0;

        while(fast.next != null){
            count++;
            fast = fast.next;
        }
        for(int i = 0; i < (count+1)/2; i++){
            slow = slow.next;
        }


        ListNode prev = null;
        fast = slow;
        while(fast != null){
            ListNode next = fast.next;
            fast.next = prev;
            prev = fast;
            fast = next;
        }
        fast = prev;

        slow = head;
        while(slow != null){
            ListNode temp = slow.next;
            ListNode fastTemp = fast.next;
            slow.next = fast;
            slow.next.next = temp;
            fast = fastTemp;
            slow = temp;
        }      
    }
}
