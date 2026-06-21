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

        ListNode reverse  = null ; 

        while(head != null)
        {   //hold the reference of next listNode 
            ListNode temp = head.next ; 
           
            ListNode curr = head  ; 
             // here we altered the next ref of head node hence the temp variable
            curr.next = reverse ; 
            // reverse here 
            reverse = curr ; 
            // go to next node 
            head  = temp ; 
        }
        return reverse ; 
        
    }
}
