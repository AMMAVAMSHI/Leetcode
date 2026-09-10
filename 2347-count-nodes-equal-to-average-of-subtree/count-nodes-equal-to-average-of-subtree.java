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
    int count = 0;
    public int averageOfSubtree(TreeNode root) {
        sum(root);
        return count;
    }
    int sum(TreeNode root){
        if(root == null){
            return 0;
        }
        int total = root.val + sum(root.left) + sum(root.right);
        int n = nodes(root);
        if(root.val == total/n){
            count++;
        }
        return total;
    }
    int nodes(TreeNode root){
        if(root == null){
            return 0;
        }
        return 1+nodes(root.left)+nodes(root.right);
    }
}