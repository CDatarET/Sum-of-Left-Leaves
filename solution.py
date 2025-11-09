# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def preorder(self, root, arr):
        if not root:
            return
        
        if root.left and not root.left.left and not root.left.right:
            arr[0] += root.left.val
        
        self.preorder(root.left, arr)
        self.preorder(root.right, arr)

    def sumOfLeftLeaves(self, root):
        arr = [0]
        self.preorder(root, arr)
        return arr[0]
