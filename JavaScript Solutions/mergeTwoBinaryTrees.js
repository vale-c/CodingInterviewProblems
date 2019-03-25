/**
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */
/**
 * @param {TreeNode} t1
 * @param {TreeNode} t2
 * @return {TreeNode}
 */
var mergeTrees = function (t1, t2) {

  if (t1 === null || t2 === null) {
    return t1 || t2;
  }

  const root = new TreeNode(t1.val + t2.val);
  //build the root of the tree by summing up the values forming it

  const left = mergeTrees(t1.left, t2.left);
  const right = mergeTrees(t1.right, t2.right);

  root.left = left;
  root.right = right;

  return root;

};