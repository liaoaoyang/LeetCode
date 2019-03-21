package co.iay.leetcode.Easy;

import java.util.List;

/**
 * 559. Maximum Depth of N-ary Tree
 * https://leetcode.com/problems/maximum-depth-of-n-ary-tree/
 * Given a n-ary tree, find its maximum depth.
 * <p>
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 * <p>
 * For example, given a 3-ary tree:
 * <p>
 * We should return its max depth, which is 3.
 * <p>
 * Note:
 * <p>
 * The depth of the tree is at most 1000.
 * The total number of nodes is at most 5000.
 */
@SuppressWarnings({"unused"})
public class MaximumDepthOfNAryTree {
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

    private int maxDepth;

    private void travel(Node node, int nowDepth) {
        if (null == node) {
            return;
        }

        nowDepth++;
        maxDepth = maxDepth > nowDepth ? maxDepth : nowDepth;

        if (node.children == null || node.children.size() <= 0) {
            return;
        }

        for (Node n : node.children) {
            travel(n, nowDepth);
        }
    }

    public int maxDepth(Node root) {
        maxDepth = 0;

        travel(root, 0);

        return maxDepth;
    }
}
