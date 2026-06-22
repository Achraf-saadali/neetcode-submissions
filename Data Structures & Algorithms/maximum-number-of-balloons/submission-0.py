class Solution:
    def maxNumberOfBalloons(self, text: str) -> int:
        counter : List[int] = [0]*26
        for char in text :
            if char in ['a','b','n']: counter[ord(char)-ord('a')] +=1
            elif char in ['o','l'] : counter[ord(char)-ord('a')] +=1/2
            
        min : int = len(text) 

        for  char in 'balon':
            count : int =counter[ord(char)-ord('a')]
            if min >  count : min = count

            if min == 0 : return 0 

        return int(min) 