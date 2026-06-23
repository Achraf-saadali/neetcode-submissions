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
    public List<Integer> preorderTraversal(TreeNode root) {
        //empty is empty ??
        if(root == null) return new ArrayList<>();
        List<Integer> L = new ArrayList<>();
        // We construct Our preorder Traversal List ...
        preorderAddition(L,root);

        return L ; 
        
    }

    private void preorderAddition(List<Integer> L ,TreeNode root)
    {
        if(root == null) return  ; 
        // Addition the root value
        L.add(root.val);
        //Then recursively we add the left nodes values first 
        preorderAddition(L,root.left);
        // and then the right ones afterwards
        preorderAddition(L,root.right);
        

    }
}