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
    void order1(TreeNode root1, ArrayList<Integer> tree1) {
        if(root1 == null) {
            return;
        }
        if(root1.left == null && root1.right == null) {
            tree1.add(root1.val);
            return;
        }
        order1(root1.left, tree1);
        order1(root1.right, tree1);
    }
    void order2(TreeNode root2, ArrayList<Integer> tree2) {
        if(root2 == null) {
            return;
        }
        if(root2.left == null && root2.right == null) {
            tree2.add(root2.val);
            return;
        }
        order2(root2.left, tree2);
        order2(root2.right, tree2);
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> tree1 = new ArrayList<>();
        ArrayList<Integer> tree2 = new ArrayList<>();
        order1(root1, tree1);
        order2(root2, tree2);
        return tree1.equals(tree2);
    }
}