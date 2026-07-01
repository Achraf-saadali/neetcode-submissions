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
        
        // We reverse the node so we can count correctly ...

        ListNode newHead = reverse(head);
        
        // we track it ...
        ListNode tracker = newHead ; 
         
        // Since we stop before the node to remove it 
        // we find issues on  first and second node since they stop both  at the very first Node 
        
        
        // so if we are at first we cut the chase fast ..   
        if(n == 1)   return reverse(newHead.next) ;


        // otherwise we chase before node !! 
        for(int i = 1 ; i < n-1 ; i++) tracker = tracker.next ; 


        // deleting the node in course of action ! 

        if(tracker != null && tracker.next != null) tracker.next = tracker.next.next ;

        // give me my original node back  
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
