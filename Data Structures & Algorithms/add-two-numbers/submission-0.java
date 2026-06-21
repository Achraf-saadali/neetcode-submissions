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
        
        // Node tobe returned ....
        ListNode newNode = new ListNode() , tracker = newNode ;
        // the carry when adding two numbers that sums up to  more then 10  
        int carry  = 0 ;
        while(l1 != null || l2 != null || carry == 1)
        {
          int value1 = (l1 != null) ? l1.val : 0 ;
          int value2 = (l2 != null) ? l2.val : 0 ;
          int value = (value1+value2+carry) %10 ; 
          carry = (value1+value2+carry)/10 ; 
          tracker.next = new ListNode(value);
          tracker = tracker.next ; 
          
          l1  = (l1 == null)? null: l1.next ; 
          l2  = (l2 == null )? null : l2.next ; 
        }

        return newNode.next ; 
        
    }
}
