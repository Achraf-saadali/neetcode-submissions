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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> L = new ArrayList<Integer>();
        if(root == null ) return L ; 
        
        ArrayDeque<TreeNode> arr = new ArrayDeque<>();
        arr.offer(root);
        while(! arr.isEmpty())
        {
            int size = arr.size() ,done =  0 ;
            while(size-- > 0 )
            {
                TreeNode value = arr.poll();
                if( done == 0 ){L.add(value.val);done = 1 ; }
               
                if(value.right != null) {arr.offer(value.right);}
                  if(value.left != null){arr.offer(value.left) ; }
               
            }
        }
        return L ; 
        
    }
}
