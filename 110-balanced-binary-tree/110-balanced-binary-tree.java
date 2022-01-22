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
    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }else if(root.left == null && root.right==null ){
            return true;
        }
            
        else{
            int diff = height(root.left) - height(root.right);
            return (diff >=-1 && diff <=1) && isBalanced(root.left) && isBalanced(root.right);
        }     
    }
    
    public int height(TreeNode root){
        if(root == null){
            return 0;
        }
        if(root.left==null && root.right==null){
            return 1;
        }
        else{
            return 1+ max ( height(root.left) ,height(root.right));
        }
    }
    
    public int max(int a,int b){
        if (a>b){
            return a;
        }
        return b;
    }
}