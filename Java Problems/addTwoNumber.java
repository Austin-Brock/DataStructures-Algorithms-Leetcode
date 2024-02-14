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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Initialize a dummy node to simplify edge cases
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        
        while (p != null || q != null) {
            // Get the current values of p and q; if the node is null, treat it as 0
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            
            // Calculate the sum of the current digits and the carry
            int sum = carry + x + y;
            carry = sum / 10;
            // Create a new node with the digit value of sum % 10 and attach it to the current node
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            
            // Move p and q forward
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        
        // If there's still a carry after processing both lists, add a new node
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        
        // The first node is a dummy node, so we return its next node
        return dummyHead.next;
    }
}