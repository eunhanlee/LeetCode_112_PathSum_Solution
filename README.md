# Leetcode 112. Path Sum Java Solution


https://eunhanlee.hashnode.dev/leetcode-112-path-sum-java-solution

## Problem

[LeetCode - The World's Leading Online Programming Learning Platform](https://leetcode.com/problems/path-sum/)

### Problem Solving Approach

- The objective of this problem is to check whether there is a path in the given binary tree from the root to a leaf node whose sum equals the given `targetSum`.
- Therefore, this code recursively explores paths in the given binary tree and checks if the path sum matches the `targetSum`.

### Algorithm

1. **Recursion:**
    - The `hasPathSum` function is called recursively.
    - This function subtracts the value of the current node from `targetSum` and uses the result as the new `targetSum`.
2. **Base Case:**
    - At the start of the recursive call, it checks if the current node is `null` to determine if it has reached the end of the tree.
    - If it's `null`, the current path is not valid, so it returns `false`.
3. **Leaf Node Check:**
    - It checks if the current node is a leaf node, meaning it has no children.
    - If the current node is a leaf node, it checks if `targetSum` is equal to 0.
    - If `targetSum` is 0, it means that the current path's sum matches the `targetSum`, so it returns `true`.
4. **Recursive Calls for Left and Right Subtrees:**
    - If the current node is not a leaf node, it makes recursive calls to the left and right subtrees using the modified `targetSum` value.
5. **Return Result:**
    - If either the left or right subtree returns `true`, it means there exists a path in the current path that satisfies the `targetSum`, so it returns `true`.
    - Otherwise, it returns `false`.

### Recursive Function Implementation Table

- Goal: [https://leetcode.com/problems/path-sum/](https://leetcode.com/problems/path-sum/)
- Base Case (Termination Conditions):
    
    ```java
    if root == null
    return false
    
    if left == null && right == null <- after subtracting root.val from sum
    return sum == 0
    ```
    
- Is the previous step's result needed?: Yes
- Problem Splitting (Divide the Problem):
    
    ```java
    sum -= root.val
    ```
    
- Combining Results:
    
    ```java
    boolean left
    boolean right
    return left || right
    ```
    
- Recursive Calls and Changes Before Moving to the Next Step (Recursive Call):
    
    ```java
    sum -= root.val
    ```
    

## Github Link

[https://github.com/eunhanlee/LeetCode_112_PathSum_Solution.git](https://github.com/eunhanlee/LeetCode_112_PathSum_Solution.git)

## Time Complexity: O(n), Space Complexity: O(h)

```java
class Solution {

    /**
     * Checks if there is a path from the root to a leaf node in the given binary tree
     * with a sum equal to the target sum.
     *
     * @param root      The root node of the binary tree.
     * @param targetSum The target sum to be achieved.
     * @return Returns `true` if a path exists, `false` otherwise.
     */
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }

        // Subtract the value of the current node from the target sum.
        targetSum -= root.val;

        // Check if the current node is a leaf node and if the target sum is 0.
        if (root.left == null && root.right == null) {
            return targetSum == 0;
        }

        // Recursively check the left and right subtrees.
        Boolean rightNode = hasPathSum(root.right, targetSum);
        Boolean leftNode = hasPathSum(root.left, targetSum);

        // Return `true` if there is a valid path in either the left or right subtree.
        return rightNode || leftNode;
    }
}
```

### Time Complexity

- The time complexity of this code is O(n) because it visits all nodes in the tree exactly once, where n is the number of nodes in the tree.

### Space Complexity

- Due to the recursive function calls, a call stack is built up, but it only requires space up to the height of the tree, so the space complexity is O(h), where h is the height of the tree.