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
            // Check if we have k nodes to reverse
            ListNode kthNode = getKthNode(currGroupHead, k);
            if(kthNode == null) break;            // If kth node is null, it means there are less than k nodes left

            ListNode nextGroupHead = kthNode.next;      // Next Group head is always one node above kth Node
            
            // Reversing the LinkedList from currentNode upto nextGroupHead
            ListNode curr = currGroupHead;
            ListNode prev = previousGroupTail;          // Initializing prev to dummy/previous tail
            ListNode above = null;

            // Standard reversal loop for the current group
            while (curr != nextGroupHead) {
                above = curr.next;
                curr.next = prev;
                prev = curr;
                curr = above;
            }

            // Re-wiring the connections:
            // 1. The original head (currGroupHead) is now the tail, so connect it to the next group
            currGroupHead.next = nextGroupHead;
            
            // 2. The previous group's tail should point to the new head of this reversed group (which is 'prev')
            previousGroupTail.next = prev;

            // Update pointers for the next iteration
            previousGroupTail = currGroupHead;      // The current tail becomes the previous tail for the next group
            currGroupHead = nextGroupHead;          // Move to the next group
        }

        return dummy.next;
    }

    // Helper function to find the Kth node from a starting node
    public ListNode getKthNode(ListNode head, int k){
        // k=1 check here isn't strictly necessary if handled in main, but good for safety
        if(head == null || head.next == null || k == 1) return head; 
        
        ListNode pointer = head;
        // Move pointer k-1 times to reach the kth node
        while (pointer != null && k > 1) {
            pointer = pointer.next;
            k--;
        }
        return pointer;
    }
}