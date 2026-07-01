# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:    
    def mergeKLists(self, lists: List[Optional[ListNode]]) -> Optional[ListNode]:
        # return if only One of the eleemnts exists ....
        
        if len(lists) == 1  : return lists[0]

        elif len(lists) == 0  : return None

        length : int = len(lists)//2  
        A : ListNode = self.mergeKLists(lists[:length])
        B : ListNode = self.mergeKLists(lists[length:])
        
        result : ListNode = ListNode() ; trackResult  : ListNode = result
        while A is not None and B is not None :
            if A.val >= B.val :
                 trackResult.next = ListNode(B.val)
                 B = B.next
            else :
                 trackResult.next = ListNode(A.val)
                 A = A.next

            trackResult =  trackResult.next 

        while A is not None :
            trackResult.next  = ListNode(A.val)
            trackResult = trackResult.next 
            A = A.next

        while B is not None :
            trackResult.next  = ListNode(B.val)
            trackResult = trackResult.next 
            B = B.next



        return result.next    

 


                
        