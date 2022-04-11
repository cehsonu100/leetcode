/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return helperLCA(root, p.val, q.val);
    }
    
    public TreeNode helperLCA(TreeNode root, int p, int q) {
        int rootValue = root.val;
        if(p > root.val && q > root.val) {
            return helperLCA(root.right, p, q);
        }
        else if(p < root.val && q < root.val) {
            return helperLCA(root.left, p, q);
        }
        else
            return root;
    }
}