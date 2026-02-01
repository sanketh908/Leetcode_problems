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
    public int countNodes(TreeNode root) {
        return findcountroot(root,0);
        
    }
    public static int findcountroot(TreeNode root,int count)
    {
        if(root == null)
        {
            return 0;
        }
     return    count =findcountroot(root.left,count)+findcountroot(root.right,count)+1;
    }
}