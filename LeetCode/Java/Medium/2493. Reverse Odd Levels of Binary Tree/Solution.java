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
    public TreeNode reverseOddLevels(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null) {
            return null;
        }
        int level = 0;
        q.offer(root);
        while(!q.isEmpty()) {
            int n = q.size();
            ArrayList<TreeNode> al = new ArrayList<>();
            for(int i=0;i<n;i++) {
                TreeNode cur = q.peek();
                if(cur.left != null) q.offer(cur.left);
                if(cur.right != null) q.offer(cur.right);
                al.add(cur);
                q.poll();
            }
            if(level % 2 == 1) {
                int i=0;
                int j=al.size()-1;
                while(i<j) {
                    int temp = al.get(i).val;
                    al.get(i).val = al.get(j).val;
                    al.get(j).val = temp;
                    i++; j--;
                }
            }
            level++;
        }
        return root;
    }
}