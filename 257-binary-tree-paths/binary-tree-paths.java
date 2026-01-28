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
    public List<String> binaryTreePaths(TreeNode root) {
        if (root==null)
        return null;
        List<String> list=new ArrayList<>();
        rescurtiontree(root,list,"");
        return list;
    }
    public static void  rescurtiontree(TreeNode root,List<String> list,String res ) 
    {
        if(root ==null)
        return ;
        res+=root.val;
         if(root.left == null && root.right ==null)
         {
            list.add(res);
         }
        else{
            res+="->";
            rescurtiontree(root.left,list,res);
            rescurtiontree(root.right,list,res);
        }
         
        
    }
}