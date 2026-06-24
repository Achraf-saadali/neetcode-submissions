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
    public void reorderList(ListNode head) {
        if(head == null || head.next == null) return ; 
        ListNode trackerHead = head ; 
        ListNode reversed = null ;
        int length = 0 ;
         
        while(trackerHead != null)
        {   ListNode temp  = trackerHead.next ; 
            
           
           ListNode curr = new ListNode(trackerHead.val) ; 
           curr.next = reversed ;  
            reversed = curr ;
            trackerHead = trackerHead.next ;  
             length++  ;
        }

        trackerHead = head ;
        
      
        for(int i = 0 ;i <= (length/2) ;i++)
        {  
           ListNode headMemo = trackerHead.next ; ListNode reversedMemory = reversed.next ;
           reversed.next = null ; 
           trackerHead.next = reversed ; 
           trackerHead.next.next = headMemo ;
           reversed =  reversedMemory ; 
           trackerHead = trackerHead.next.next;


        }
        trackerHead = head ;
        for(int i = 0 ; i < length-1;i++)
        trackerHead = trackerHead.next ; 

        trackerHead.next = null ;  

        

        

        
        

        

        
    }
}
