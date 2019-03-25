/**
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */
/**
 * @param {TreeNode} root
 * @param {number} val
 * @return {TreeNode}
 */
var insertIntoBST = function (root, val) {
  //Recursive Implementation !

  if (root === null) {  //if the root is null, then set val as the new root and return
    return new TreeNode(val);
  }

  if (val < root.val) { //if the val is smaller, put it in the left side of the tree
    root.left = insertIntoBST(root.left, val);
  }

  else { //if val is bigger than root put it on the right side of the tree
    root.right = insertIntoBST(root.right, val);
  }

  return root;
};