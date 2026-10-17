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
    int size;
    void pre(TreeNode root) {
        if(root == null) return;
        size++;
        pre(root.left);
        pre(root.right);
    }
    public int countNodes(TreeNode root) {
        size = 0;
        pre(root);
        return size;
    }
}