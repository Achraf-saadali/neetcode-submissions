class LinkedList:
    
    def __init__(self):
        self.array : List[int] = [] 

    
    def get(self, index: int) -> int:
        
        return -1 if index >= len(self.array) else self.array[index]
        

    def insertHead(self, val: int) -> None:
        self.array = [val , *self.array]
        

    def insertTail(self, val: int) -> None:
        self.array.append(val)
        

    def remove(self, index: int) -> bool:
        
        if index < len(self.array) :
            self.array.pop(index)
            return True

        return False    
        

    def getValues(self) -> List[int]:
        return self.array
        
