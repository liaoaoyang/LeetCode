package co.iay.leetcode.Medium;

import co.iay.leetcode.DataStructures.TreeNode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * 236. Lowest Common Ancestor of a Binary Tree
 * https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/
 * <p>
 * Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.
 * <p>
 * According to the definition of LCA on Wikipedia:
 * “The lowest common ancestor is defined between two nodes v and w
 * as the lowest node in T that has both v and w as descendants
 * (where we allow a node to be a descendant of itself).”
 * <p>
 *        _______3______
 *       /              \
 *   ___5__          ___1__
 *  /      \        /      \
 * 6      _2       0       8
 * /  \
 * 7   4
 * For example, the lowest common ancestor (LCA) of nodes 5 and 1 is 3.
 * Another example is LCA of nodes 5 and 4 is 5,
 * since a node can be a descendant of itself according to the LCA definition.
 * <p>
 * Solution:
 * 共同先祖，可以通过记录查找得到的路径之后，进行比较得到，可以通过HashSet记录短路径的所有节点，
 * 从长路径节点的最后一个节点触发，反向查找，通过O(n)的复杂度查找到最早的共同先祖。
 */
public class LowestCommonAncestorOfABinaryTree {
    private boolean travel(TreeNode root, TreeNode target, List<TreeNode> path) {
        if (root == null) {
            return false;
        }

        path.add(root);

        if (root == target) {
            return true;
        }

        boolean foundInLeft = travel(root.left, target, path);
        boolean foundInRight = travel(root.right, target, path);

        if (!foundInLeft && !foundInRight) {
            path.remove(path.size() - 1);
        }

        return foundInLeft || foundInRight;
    }

    private TreeNode findCommonAncestor(List<TreeNode> pathP, List<TreeNode> pathQ) {
        HashSet<TreeNode> shorterPath = new HashSet<TreeNode>();
        List<TreeNode> shorter = pathP.size() > pathQ.size() ? pathQ : pathP;
        List<TreeNode> longer = pathP.size() > pathQ.size() ? pathP : pathQ;
        shorterPath.addAll(shorter);

        for (int i = longer.size() - 1; i >= 0; --i) {
            if (shorterPath.contains(longer.get(i))) {
                return longer.get(i);
            }
        }

        return null;
    }

    private TreeNode pathCompareSolution(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> pathP = new ArrayList<TreeNode>();
        List<TreeNode> pathQ = new ArrayList<TreeNode>();
        travel(root, p, pathP);
        travel(root, q, pathQ);
        return findCommonAncestor(pathP, pathQ);
    }

    private TreeNode recursiveSolution(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        }

        TreeNode left = recursiveSolution(root.left, p, q);
        TreeNode right = recursiveSolution(root.right, p, q);

        if (left != null && right != null) {
            return root;
        }

        if (left != null) {
            return left;
        }

        return right;
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return recursiveSolution(root, p, q);
    }
}
