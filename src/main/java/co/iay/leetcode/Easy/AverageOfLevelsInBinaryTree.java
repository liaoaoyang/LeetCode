package co.iay.leetcode.Easy;

import co.iay.leetcode.DataStructures.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ng on 2017/7/13.
 * 637. Average of Levels in Binary Tree
 * https://leetcode.com/problems/average-of-levels-in-binary-tree/
 */
public class AverageOfLevelsInBinaryTree {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<Double>();

        if (root == null) {
            return result;
        }

        List<TreeNode> l = new ArrayList<TreeNode>();
        List<Integer> treeList = new ArrayList<Integer>();
        l.add(root);
        treeList.add(root.val);

        while (l.size() > 0) {
            double levelSum = 0;
            int levelNums = 0;

            List<TreeNode> pl = l;
            l = new ArrayList<TreeNode>();

            for (TreeNode node : pl) {
                if (node == null) {
                    continue;
                }

                if (node.left != null) {
                    l.add(node.left);
                }

                if (node.right != null) {
                    l.add(node.right);
                }

                levelSum += node.val;
                ++levelNums;
            }

            result.add(levelSum / levelNums);
        }

        return result;
    }
}
