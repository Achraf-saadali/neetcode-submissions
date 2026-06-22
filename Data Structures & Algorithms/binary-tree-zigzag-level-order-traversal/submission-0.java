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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        if(root == null) return new ArrayList<>() ;

        List<List<Integer>> L = new ArrayList<>();
        ArrayDeque<TreeNode> arr = new ArrayDeque<TreeNode>();
        arr.offer(root);
        int level = 0 ;
        while(! arr.isEmpty())
        {   
            List<Integer> m = new ArrayList<>();
             for(int i = arr.size()  ; i >= 1 ; i--)
            {
                TreeNode queue = arr.poll();
                
                if((level & 1) == 1 )m.add(0,queue.val);
                else m.add(queue.val);
              
                if(queue.left != null) arr.offer(queue.left);
                  if(queue.right != null)  arr.offer(queue.right);
                

            }
            
             level++;
             L.add(m);
        }
        return L ;
        
    }
}