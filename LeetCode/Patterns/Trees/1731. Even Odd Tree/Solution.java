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
    public boolean isEvenOddTree(TreeNode root) {
        if(root == null) {
            return true;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int level = 0;
        while(!q.isEmpty()) {
            int n = q.size();
            ArrayList<Integer> al = new ArrayList<>();
            for(int i=0;i<n;i++) {
                TreeNode cur = q.poll();
                if(cur.left != null) q.offer(cur.left);
                if(cur.right != null) q.offer(cur.right);
                al.add(cur.val);
                if(level % 2 == 0) {
                    if(cur.val % 2 == 0) return false;
                } else {
                    if(cur.val % 2 != 0) return false;
                }
            }
            if(level % 2 == 0) {
                for(int i=0;i<al.size()-1;i++) {
                    if(al.get(i) >= al.get(i+1)) return false;
                }
            } else {
                for(int i=0;i<al.size()-1;i++) {
                    if(al.get(i) <= al.get(i+1)) return false;
                }
            }
            level++;
        }
        return true;
    }
}