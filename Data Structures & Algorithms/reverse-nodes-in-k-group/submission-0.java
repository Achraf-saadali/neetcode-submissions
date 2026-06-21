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
    public ListNode reverseKGroup(ListNode head, int k) {
        
        ListNode trackerHead = head , answer = new ListNode() , answerTrack = answer ; 
        while( trackerHead != null)
        { 
          ListNode reverse =  null ;
          int m  = k ;
          ListNode keepInCase = trackerHead ;  
          while(m > 0 && trackerHead != null)
          { 
          
          
          ListNode curr = new ListNode(trackerHead.val) ; 
          curr.next = reverse ; 
          reverse = curr ; 
          
          trackerHead = trackerHead.next;
          m--;
          }


          if(m == 0) answerTrack.next = reverse ;
          
          else  answerTrack.next = keepInCase ;

          while(answerTrack != null && answerTrack.next != null )
           answerTrack=answerTrack.next;

           
       
        }
        return answer.next ; 
        
    }
}
