
class ListNode :
    def __init__(self,val : int = 0 , next : "ListNode"  = None):
        self.val = val 
        self.next = next 


class MinStack:

    def __init__(self):
        self.node = ListNode(2**(31) - 1)
        
        

    def push(self, val: int) -> None:
        myNode : ListNode = self.node

        while myNode is not None and myNode.next is not None :
            myNode = myNode.next

        myNode.next = ListNode(val)    


        

    def pop(self) -> None:
        myNode : ListNode = self.node
        while myNode is not None and myNode.next is not None and myNode.next.next is not None  :
            myNode = myNode.next

        myNode.next = None        
        

    def top(self) -> int:
        myNode : ListNode = self.node.next
        while myNode is not None and myNode.next  is not None :
            myNode = myNode.next

        return myNode.val 
        

    def getMin(self) -> int:
        myNode :ListNode = self.node
        minVal : int = 2**(31) - 1 
        while myNode is not None  :
            if minVal > myNode.val:
                minVal = myNode.val
            myNode = myNode.next

        return minVal       
        
