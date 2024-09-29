/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */

/**
 * @param {ListNode} headA
 * @param {ListNode} headB
 * @return {ListNode}
 */
var getIntersectionNode = function (headA, headB) {
  let hA = headA;
  let hB = headB;

  while (hA !== hB) {
    hA = hA ? hA.next : headB;
    hB = hB ? hB.next : headA;
  }

  return hA;
};

/**
 * Time Complexity: O(N + M), where N and M are the lengths of the two linked lists.
 * Space Complexity: O(1), as no additional space is used apart from pointers.
 */