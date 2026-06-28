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
    public boolean isPalindrome(ListNode head) {

        ListNode reverse = null , trackerHead = head ;

        while(trackerHead != null)
        {
            ListNode curr = new ListNode(trackerHead.val);
            curr.next = reverse ; 
            reverse = curr ; 
            trackerHead = trackerHead.next ; 
        } 

        while(head != null && head.val == reverse.val)
        {
            head = head.next ; 
            reverse = reverse.next ; 
        }

        return head == null ; 

        
    }
}