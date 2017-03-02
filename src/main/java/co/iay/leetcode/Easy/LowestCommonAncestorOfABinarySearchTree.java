package co.iay.leetcode.Easy;

import co.iay.leetcode.DataStructures.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ng on 17/2/26.
 * 235. Lowest Common Ancestor of a Binary Search Tree
 * https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
 */
public class LowestCommonAncestorOfABinarySearchTree {
    private void getPathTravel(TreeNode node, TreeNode target, List<TreeNode> path) {
        if (null == node || null == target) {
            return;
        }

        path.add(node);

        if (node.val > target.val) {
            getPathTravel(node.left, target, path);
        } else if (node.val < target.val) {
            getPathTravel(node.right, target, path);
        }
    }

    private List<TreeNode> getPath(TreeNode root, TreeNode target) {
        List<TreeNode> path = new ArrayList<TreeNode>();
        getPathTravel(root, target, path);

        return path;
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> pathP = getPath(root, p);
        List<TreeNode> pathQ = getPath(root, q);
        int length = pathP.size() > pathQ.size() ? pathQ.size() : pathP.size();
        int lcaIdx = length - 1;

        for (; lcaIdx >= 0; --lcaIdx) {
            if (pathP.get(lcaIdx) == pathQ.get(lcaIdx)) {
                return pathP.get(lcaIdx);
            }
        }

        return null;
    }
}
