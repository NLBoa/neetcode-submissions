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
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        return reverseListAux(head);
    }

    private ListNode reverseListAux(ListNode curr){

        if(curr.next == null){
            return curr;
        } else {
            ListNode temp = reverseListAux(curr.next);
            curr.next.next = curr;

            curr.next = null;

            return temp;

        }
    }
}
