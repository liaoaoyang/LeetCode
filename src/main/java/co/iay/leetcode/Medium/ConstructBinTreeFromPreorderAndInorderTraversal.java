package co.iay.leetcode.Medium;

import co.iay.leetcode.DataStructures.TreeNode;

import java.util.HashMap;

/**
 * 105. Construct Binary Tree from Preorder and Inorder Traversal
 * https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
 * Given preorder and inorder traversal of a tree, construct the binary tree.
 * <p>
 * Note:
 * You may assume that duplicates do not exist in the tree.
 * <p>
 * For example, given
 * <p>
 * preorder = [3,9,20,15,7]
 * inorder = [9,3,15,20,7]
 * Return the following binary tree:
 * <p>
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 */
public class ConstructBinTreeFromPreorderAndInorderTraversal {
    private TreeNode rebuild(
            HashMap<Integer, Integer> preOrderIdxMap,
            HashMap<Integer, Integer> inOrderIdxMap,
            int[] preorder,
            int preOrderLeft,
            int preOrderRight,
            int[] inorder,
            int inOrderLeft,
            int inOrderRight) {
        if (preOrderLeft > preOrderRight || preOrderLeft < 0 || preOrderRight >= preorder.length) {
            return null;
        }

        int nowRootVal = preorder[preOrderLeft];
        TreeNode root = new TreeNode(nowRootVal);
        int nowRootInOrderIdx = inOrderIdxMap.get(nowRootVal);
        int leftLength = nowRootInOrderIdx - inOrderLeft;
        leftLength = leftLength > 0 ? leftLength : 0;
        int rightLength = inOrderRight - nowRootInOrderIdx;

        if (inOrderLeft >= 0 &&
                inOrderLeft < inorder.length &&
                nowRootInOrderIdx - 1 >= 0 &&
                nowRootInOrderIdx - 1 < inorder.length) {
            int leftTreePreOrderLeft = preOrderLeft + 1;
            int leftTreePreOrderRight = leftTreePreOrderLeft + leftLength - 1;

            root.left = rebuild(
                    preOrderIdxMap,
                    inOrderIdxMap,
                    preorder,
                    leftTreePreOrderLeft,
                    leftTreePreOrderRight,
                    inorder,
                    inOrderLeft,
                    nowRootInOrderIdx - 1
            );
        }

        if (inOrderRight >= 0 &&
                inOrderRight < inorder.length &&
                nowRootInOrderIdx + 1 >= 0 &&
                nowRootInOrderIdx + 1 < inorder.length) {
            int rightTreePreOrderLeft = preOrderLeft + leftLength + 1;
            int rightTreePreOrderRight = rightTreePreOrderLeft + rightLength - 1;

            root.right = rebuild(
                    preOrderIdxMap,
                    inOrderIdxMap,
                    preorder,
                    rightTreePreOrderLeft,
                    rightTreePreOrderRight,
                    inorder,
                    nowRootInOrderIdx + 1,
                    inOrderRight
            );
        }

        return root;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> preOrderIdxMap = new HashMap<>();
        HashMap<Integer, Integer> inOrderIdxMap = new HashMap<>();

        for (int i = 0; i < preorder.length; ++i) {
            preOrderIdxMap.put(preorder[i], i);
        }

        for (int i = 0; i < inorder.length; ++i) {
            inOrderIdxMap.put(inorder[i], i);
        }

        TreeNode root = rebuild(
                preOrderIdxMap,
                inOrderIdxMap,
                preorder,
                0,
                preorder.length - 1,
                inorder,
                0,
                inorder.length - 1);

        return root;
    }
}
