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
    private int preIndex = 0;    
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        return buildTree(preorder, postorder, 0, postorder.length - 1);
    }
    private TreeNode buildTree(int[] preorder, int[] postorder, int left, int right) {
        if (left > right) return null; 
        TreeNode root = new TreeNode(preorder[preIndex++]); 
        if (left == right) return root; 
        int leftChildIndex = left;
        while (postorder[leftChildIndex] != preorder[preIndex]) {
            leftChildIndex++;
        }
        root.left = buildTree(preorder, postorder, left, leftChildIndex);
        root.right = buildTree(preorder, postorder, leftChildIndex + 1, right - 1);
        return root;
    }
}
