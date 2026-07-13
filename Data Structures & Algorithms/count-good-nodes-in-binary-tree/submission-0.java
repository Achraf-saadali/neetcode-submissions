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
    public int goodNodes(TreeNode root) {

        

        if(root == null ) return 0 ;
        return nodes(root,root.val);

        

        


        

             
        
    }
    private int nodes(TreeNode root , int max)
    { if(root == null) return 0 ; 
      int val = 0 ;
      if(root.val >= max){ max = root.val ; val = 1; }
       

       return val + nodes(root.left,max) + nodes(root.right,max);
    } 

}
