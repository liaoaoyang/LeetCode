package co.iay.leetcode.Easy;

import java.util.List;

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
