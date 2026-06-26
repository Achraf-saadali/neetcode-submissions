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
    public int kthSmallest(TreeNode root, int k) {
          
          TreeNode rootReplica = root ; 
          List<Integer> L = new ArrayList<>();

         

          constructList(root ,L  );
         
          return L.get(k-1);    
          
          
          

          

          
        
    }
    private void constructList(TreeNode replica ,  List list)
    {   if( replica == null ) return ;

          constructList(replica.left , list);
           list.add(replica.val) ;
          constructList(replica.right , list); 
         
       
    }


}