/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left;
 *     public TreeNode right;
 *     public TreeNode(int val=0, TreeNode left=null, TreeNode right=null) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class Solution {
    public void Preorder(TreeNode root, int[] sum){
        if(root == null){
            return;
        }

        if(root.left != null && root.left.left == null && root.left.right == null){
            sum[0] = sum[0] + root.left.val;
        }
        Preorder(root.left, sum);
        Preorder(root.right, sum);
    }

    public int SumOfLeftLeaves(TreeNode root) {
        int[] sum = {0};
        Preorder(root, sum);
        return(sum[0]);
    }
}
