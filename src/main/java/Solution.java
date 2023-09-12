public class Solution {

    /**
     * Checks if there exists a root-to-leaf path in a binary tree
     * where the sum of node values along the path equals the given target sum.
     *
     * @param root      The root node of the binary tree.
     * @param targetSum The target sum to be matched.
     * @return {@code true} if a path with the target sum exists, {@code false} otherwise.
     */
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }

        // Subtract the current node's value from the target sum.
        targetSum -= root.val;

        // Check if the current node is a leaf node and if the targetSum is now 0.
        if (root.left == null && root.right == null) {
            return targetSum == 0;
        }

        // Recursively check the left and right subtrees.
        Boolean rightNode = hasPathSum(root.right, targetSum);
        Boolean leftNode = hasPathSum(root.left, targetSum);

        // Return true if either the left or right subtree contains a valid path.
        return rightNode || leftNode;
    }
}
