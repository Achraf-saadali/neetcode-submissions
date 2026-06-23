/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
          //empty is empty ??
        if(root == null) return new ArrayList<>();
        List<Integer> L = new ArrayList<>();
        // We construct Our preorder Traversal List ...
        inorderAddition(L,root);

        return L ; 
        
    }
    private void inorderAddition(List<Integer> L ,TreeNode root)
    {
        if(root == null) return  ; 
       
        inorderAddition(L,root.left);
        
        L.add(root.val);
       
        inorderAddition(L,root.right);
        

    }
}