package co.iay.leetcode.Easy;

import java.util.ArrayList;
import java.util.List;

/**
 * 589. N-ary Tree Preorder Traversal
 * https://leetcode.com/problems/n-ary-tree-preorder-traversal/
 * Given an n-ary tree, return the preorder traversal of its nodes' values.
 * <p>
 * For example, given a 3-ary tree:
 * <p>
 * Return its preorder traversal as: [1,3,5,6,2,4].
 * <p>
 * Note:
 * <p>
 * Recursive solution is trivial, could you do it iteratively?
 */
public class NAryTreePreorderTraversal {
    public static class Node {
        public int        val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    ;

    private void travel(Node node, List<Integer> result) {
        if (null == node) {
            return;
        }

        result.add(node.val);

        if (node.children == null || node.children.size() <= 0) {
            return;
        }

        for (Node n : node.children) {
            travel(n, result);
        }
    }

    public List<Integer> preorder(Node root) {
        List<Integer> result = new ArrayList<>();
        travel(root, result);

        return result;
    }
}
