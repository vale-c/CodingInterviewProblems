/**
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */
/**
 * @param {TreeNode} root
 * @return {TreeNode}
 */
var invertTree = function (root) {

  if (root === null) return null;

  let tmp = root.left;
  root.left = invertTree(root.right);
  root.right = invertTree(tmp);

  return root;
};

/**
 * Time Complexity: O(N), where N is the number of nodes in the tree, as each node is visited once.
 * Space Complexity: O(H), where H is the height of the tree, due to the recursion stack.
 */