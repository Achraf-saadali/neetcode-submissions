# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def isValidBST(self, root: Optional[TreeNode]) -> bool:
        the_list : List[int] = self.myList(root)
        length : int = len(the_list)
        for i in range(1,length):
            if the_list[i] <= the_list[i-1]: return False
        return True



    def myList(self,root:Optional[TreeNode]) -> List[int]:
        if root is None : return []

        return self.myList(root.left)+[root.val]+self.myList(root.right)    
        