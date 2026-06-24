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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || head.next == null) return head  ;
        int i = 1 ; 
        ListNode thereturnNode = new ListNode() , track = thereturnNode ; 
        ListNode trackerHead = head ; 
            
             while(i < left )
             {  
                ListNode temp  = trackerHead.next  ;
                track.next = trackerHead ;
                trackerHead.next = null ; 
                track = track.next ; 
                trackerHead = temp ; 
                i++;
                

               

             }


             ListNode reversed = null , lastNode = trackerHead ; 
             for( ;i <= right;i++)
             {  ListNode temp = trackerHead.next ;  
                ListNode curr = trackerHead ;
                trackerHead.next = null ; 
                curr.next  = reversed ; 
                reversed = curr ; 
                trackerHead = temp ;  

                
             }

             track.next = reversed ; 
             lastNode.next = trackerHead ; 

             return thereturnNode.next ; }
}