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
    public List<Integer> postorderTraversal(TreeNode root) {

          if(root == null) return new ArrayList<>();
          List<Integer> L = new ArrayList<>();
          postorderTraversal(root,L);

          return L ;

        
    }
    private void postorderTraversal(TreeNode root , List<Integer> L)
    {
        if(root  == null) return  ; 
        postorderTraversal(root.left,L);
        postorderTraversal(root.right,L);
        L.add(root.val) ; 

    } 
}