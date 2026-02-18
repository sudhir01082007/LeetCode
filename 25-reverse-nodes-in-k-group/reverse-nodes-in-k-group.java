/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || k == 1 || head.next == null) return head;
        
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode previousGroupTail = dummy;
        ListNode currGroupHead = head;

        while (true) {
            ListNode kthNode = getKthNode(currGroupHead, k);
            if(kthNode == null) break;  
            ListNode nextGroupHead = kthNode.next; 
            ListNode curr = currGroupHead;
            ListNode prev = previousGroupTail;
            ListNode above = null;
            while (curr != nextGroupHead) {
                above = curr.next;
                curr.next = prev;
                prev = curr;
                curr = above;
            }
            currGroupHead.next = nextGroupHead;
            previousGroupTail.next = prev;
            previousGroupTail = currGroupHead;    
            currGroupHead = nextGroupHead; 
        }

        return dummy.next;
    }
    public ListNode getKthNode(ListNode head, int k){
        if(head == null || head.next == null || k == 1) return head; 
        
        ListNode pointer = head;
        while (pointer != null && k > 1) {
            pointer = pointer.next;
            k--;
        }
        return pointer;
    }
}