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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> L = new ArrayList<>() ;
        if(root == null) return L ;  
        Queue<TreeNode> queue = new LinkedList<>() ; 

        queue.offer(root) ; 

        while(!queue.isEmpty())
        {
            int size = queue.size() ;
            List<Integer> insideList = new ArrayList<>(); 
            for(;size-- >0 ;)
            {  TreeNode value = queue.remove() ;

               insideList.add(value.val); 

               if(value.left != null)  queue.offer(value.left);

               if(value.right != null) queue.offer(value.right);
              

            }
            L.add(insideList);
        }

        return L ; 


        
    }
}
