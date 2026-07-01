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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        if(head == null) return null ; 
        
        ListNode newHead = reverse(head);
        ListNode tracker = newHead ; 
        if(n == 1)   return reverse(newHead.next) ;
        for(int i = 1 ; i < n-1 ; i++) tracker = tracker.next ; 

        

        if(tracker != null && tracker.next != null) tracker.next = tracker.next.next ;

        return reverse(newHead) ;  
             
        
   
       
        

    }

    private ListNode reverse(ListNode head)
    {
        ListNode reversed = null ; 

        while(head != null)
        {
            ListNode temp = head.next ; 
            head.next = reversed ;
            reversed = head ; 
            head = temp ;  
            
        }

        return reversed;
    }
   
}
