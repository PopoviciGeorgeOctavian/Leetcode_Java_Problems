
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public boolean isSymmetric(TreeNode root) {

        if (root == null) {
            return true;
        }
        return isMirror(root.left, root.right);

}
    private boolean isMirror(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true; // Both subtrees are empty, considered symmetric
        }

        if (left == null || right == null) {
            return false; // One subtree is empty and the other is not, not symmetric
        }

        // Check values of the current nodes and their subtrees
        return (left.val == right.val) && isMirror(left.left, right.right) && isMirror(left.right, right.left);
    }
}