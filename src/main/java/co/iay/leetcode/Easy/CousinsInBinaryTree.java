package co.iay.leetcode.Easy;

import co.iay.leetcode.DataStructures.TreeNode;

/**
 * 993. Cousins in Binary Tree
 * https://leetcode.com/problems/cousins-in-binary-tree/
 * <p>
 * In a binary tree, the root node is at depth 0,
 * and children of each depth k node are at depth k+1.
 * <p>
 * Two nodes of a binary tree are cousins if they have the same depth,
 * but have different parents.
 * <p>
 * We are given the root of a binary tree with unique values,
 * and the values x and y of two different nodes in the tree.
 * <p>
 * Return true if and only if the nodes corresponding to the values x and y are cousins.
 */
public class CousinsInBinaryTree {
    private static class MyPair<K, V> {
        private K key;
        private V value;

        MyPair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }

    private MyPair<Integer, TreeNode> getHeight(TreeNode node, int v, int h) {
        if (node == null) {
            return null;
        }

        if ((node.left != null && node.left.val == v) ||
                (node.right != null && node.right.val == v)) {
            return new MyPair<>(h + 1, node);
        }

        MyPair<Integer, TreeNode> l = getHeight(node.left, v, h + 1);
        MyPair<Integer, TreeNode> r = getHeight(node.right, v, h + 1);

        return l != null ? l : r;
    }

    public boolean isCousins(TreeNode root, int x, int y) {
        MyPair<Integer, TreeNode> xp = getHeight(root, x, 0);
        MyPair<Integer, TreeNode> yp = getHeight(root, y, 0);

        if (xp == null || yp == null) {
            return false;
        }

        if (!xp.getKey().equals(yp.getKey())) {
            return false;
        }

        return xp.getValue() != yp.getValue();
    }
}
