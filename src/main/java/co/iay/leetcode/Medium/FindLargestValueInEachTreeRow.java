package co.iay.leetcode.Medium;

import co.iay.leetcode.DataStructures.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ng on 17/3/26.
 * 515. Find Largest Value in Each Tree Row
 * https://leetcode.com/problems/find-largest-value-in-each-tree-row
 */
public class FindLargestValueInEachTreeRow {
    public List<Integer> largestValues(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<Integer>();

        if (root == null) {
            return result;
        }

        List<TreeNode> l = new ArrayList<TreeNode>();
        l.add(root);
        result.add(root.val);

        while (true) {

            List<TreeNode> pl = l;
            l = new ArrayList<TreeNode>();

            int levelMax = Integer.MIN_VALUE;

            boolean allNull = true;

            for(TreeNode node : pl) {
                if (node == null) {
                    continue;
                }

                if (node.left != null) {
                    l.add(node.left);
                    int nodeVal = node.left.val;
                    levelMax = (levelMax < nodeVal ? nodeVal : levelMax);
                    allNull = false;
                } else {
                    l.add(null);
                }

                if (node.right != null) {
                    l.add(node.right);
                    int nodeVal = node.right.val;
                    levelMax = (levelMax < nodeVal ? nodeVal : levelMax);
                    allNull = false;
                } else {
                    l.add(null);
                }
            }

            if (allNull) {
                break;
            }
            else {
                result.add(levelMax);
            }
        }

        return result;
    }
}
