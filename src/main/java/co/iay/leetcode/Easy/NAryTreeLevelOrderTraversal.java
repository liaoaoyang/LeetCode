package co.iay.leetcode.Easy;

import java.util.ArrayList;
import java.util.List;

/**
 * 429. N-ary Tree Level Order Traversal
 * https://leetcode.com/problems/n-ary-tree-level-order-traversal/
 * Given an n-ary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
 * <p>
 * For example, given a 3-ary tree:
 * <p>
 * We should return its level order traversal:
 * <p>
 * [
 * [1],
 * [3,2,4],
 * [5,6]
 * ]
 * <p>
 * Note:
 * <p>
 * The depth of the tree is at most 1000.
 * The total number of nodes is at most 5000.
 */
public class NAryTreeLevelOrderTraversal {
    private static class Node {
        public int        val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        List<Node> curLevel = new ArrayList<>();
        List<Node> nextLevel = new ArrayList<>();
        curLevel.add(root);

        while (curLevel.size() > 0) {
            List<Integer> level = new ArrayList<>();

            while (curLevel.size() > 0) {
                Node node = curLevel.get(0);
                curLevel.remove(0);
                level.add(node.val);

                if (node.children != null && node.children.size() > 0) {
                    nextLevel.addAll(node.children);
                }
            }

            if (level.size() > 0) {
                result.add(level);
            }

            if (nextLevel.size() > 0) {
                curLevel.addAll(nextLevel);
                nextLevel.clear();
            }
        }

        return result;
    }
}
