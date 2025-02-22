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
    int index = 0;

    public TreeNode recoverFromPreorder(String traversal) {
        return buildTree(traversal, 0);
    }

    private TreeNode buildTree(String s, int depth) {
        int d = 0, n = s.length();

        while (index + d < n && s.charAt(index + d) == '-') d++;
        if (d != depth) return null; 
        
        index += d;
        int val = 0;
        while (index < n && Character.isDigit(s.charAt(index))) {
            val = val * 10 + (s.charAt(index) - '0');
            index++;
        }

        TreeNode node = new TreeNode(val);
        node.left = buildTree(s, depth + 1);
        node.right = buildTree(s, depth + 1);

        return node;
    }
}