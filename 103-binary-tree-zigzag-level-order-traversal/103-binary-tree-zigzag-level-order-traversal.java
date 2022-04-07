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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) 
            return res;
        
        //Queue
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean reverse = false;
        
        while(!q.isEmpty()) {
            List<Integer> nodesInSamelevel = new ArrayList<>(); 
            int size = q.size();
            for(int i = 0; i < size; i++) {
                TreeNode currNode = q.poll();
                nodesInSamelevel.add(currNode.val);
                if(currNode.left != null) 
                    q.add(currNode.left);
                if(currNode.right != null) 
                    q.add(currNode.right);
                
            }
            if(reverse) 
                Collections.reverse(nodesInSamelevel);
            reverse = !reverse;
            res.add(nodesInSamelevel);
        }
        
        return res;
    }
}