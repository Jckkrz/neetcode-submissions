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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> values = new ArrayList<>();
        traverse(root, values);
        return values;
        
    }

    private void traverse(TreeNode node, List<Integer> values) {
    if (node == null) {
        return;
    }

    traverse(node.left, values);
    
    traverse(node.right, values);
    values.add(node.val);
}
}