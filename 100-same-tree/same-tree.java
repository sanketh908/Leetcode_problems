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
    public boolean isSameTree(TreeNode p, TreeNode q) {
      Queue<TreeNode> qu = new LinkedList<>();
      qu.add(p);
      qu.add(q);
      while(!qu.isEmpty())
      {
       TreeNode first=qu.poll();
       TreeNode secound=qu.poll();

       if(first == null && secound ==null)
       {
        continue;
       }
       else if(first == null || secound == null || secound.val != first.val )
       {
         return false;
       }
       qu.add(first.left);
       qu.add(secound.left);
       qu.add(first.right); 
       qu.add(secound.right);
      }

        return true;
    }
  
}