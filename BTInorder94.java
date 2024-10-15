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
    public List<Integer> inorderTraversal(TreeNode root) {
        
        // create an arrayList
        List <Integer> arrayList = new ArrayList<>();

        // handle the null case
        if (root == null) {
            return arrayList;
        }

        // traversing left subtree
        arrayList.addAll(inorderTraversal (root.left));

        // visit the current node
        arrayList.add (root.val);

        // traversing right subtree
        arrayList.addAll(inorderTraversal (root.right));

        // return the list
        return arrayList;
    }
}