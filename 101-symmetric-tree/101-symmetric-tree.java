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
    public boolean isSymmetric(TreeNode root) {
        
        if(root.left == null && root.right == null){
            return true;
        }else if( (root.left != null && root.right == null) || (root.left == null && root.right != null) ) {
            return false;
        }else{
            return checkSymmetric(root.left, root.right);
        }
        
    }
    
    public boolean checkSymmetric(TreeNode l, TreeNode r){
        if((l ==null && r!=null) || (l !=null && r==null)  ){
            return false;
        }
        if(l==null && r ==null){
            return true;
        }
        if(l.val != r.val){
            return false;
        }
        
        if( (l.left == null && l.right ==null) && (r.left == null && r.right == null) && (l.val == r.val)){
            return true;
        }
        return checkSymmetric(l.left, r.right) && checkSymmetric(l.right, r.left);   
    }
}