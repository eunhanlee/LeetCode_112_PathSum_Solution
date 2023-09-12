import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class SolutionTest {
    @Test
    public void testHasPathSum() {
        Solution solution = new Solution();
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(1);

        assertTrue(solution.hasPathSum(root, 22));
        assertFalse(solution.hasPathSum(root, 20));
        assertTrue(solution.hasPathSum(root, 27));
        assertTrue(solution.hasPathSum(root, 18));
        assertTrue(solution.hasPathSum(root, 26));
        assertFalse(solution.hasPathSum(null, 0));
        assertFalse(solution.hasPathSum(root, 0));
        assertFalse(solution.hasPathSum(root, 5));
        assertFalse(solution.hasPathSum(root, 10));
        assertFalse(solution.hasPathSum(root, 21));

        System.out.println("All test cases passed.");
    }
}
