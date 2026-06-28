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
             reverse = new ListNode(trackerHead.val,reverse);
            
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