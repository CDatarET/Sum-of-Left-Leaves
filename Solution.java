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
    public void preorder(TreeNode root, int[] sum){
        if(root == null){
            return;
        }

        if(root.left != null && root.left.left == null && root.left.right == null){
            sum[0] = sum[0] + root.left.val;
        }
        preorder(root.left, sum);
        preorder(root.right, sum);
    }
    
    public int sumOfLeftLeaves(TreeNode root) {
        int[] sum = {0};
        preorder(root, sum);
        return(sum[0]);
    }
}
