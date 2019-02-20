package co.iay.leetcode.Medium;

import co.iay.leetcode.DataStructures.TreeNode;

import java.util.HashSet;
import java.util.Set;

/**
 * 988. Smallest String Starting From Leaf
 * https://leetcode.com/problems/smallest-string-starting-from-leaf/
 * <p>
 * Given the root of a binary tree, each node has a value from 0 to 25 representing the letters 'a' to 'z': a value of 0 represents 'a', a value of 1 represents 'b', and so on.
 * <p>
 * Find the lexicographically smallest string that starts at a leaf of this tree and ends at the root.
 * <p>
 * (As a reminder, any shorter prefix of a string is lexicographically smaller: for example, "ab" is lexicographically smaller than "aba".  A leaf of a node is a node that has no children.)
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * <p>
 * <p>
 * Input: [0,1,2,3,4,3,4]
 * Output: "dba"
 * Example 2:
 * <p>
 * <p>
 * <p>
 * Input: [25,1,3,1,3,0,2]
 * Output: "adz"
 * Example 3:
 * <p>
 * <p>
 * <p>
 * Input: [2,2,1,null,1,0,null,0]
 * Output: "abc"
 */
public class SmallestStringStartingFromLeaf {
    private void travel(TreeNode node, Set<String> strs, StringBuilder sb) {
        if (node == null) {
            return;
        }

        sb.insert(0, (char) ('a' + node.val));

        if (node.left == null && node.right == null) {
            strs.add(sb.toString());
            sb.deleteCharAt(0);
            return;
        }

        travel(node.left, strs, sb);
        travel(node.right, strs, sb);
        sb.deleteCharAt(0);
    }

    public String smallestFromLeaf(TreeNode root) {
        Set<String> strs = new HashSet<>();
        travel(root, strs, new StringBuilder());
        String result = null;

        for (String str : strs) {
            if (null == result) {
                result = str;
                continue;
            }

            result = result.compareTo(str) > 0 ? str : result;
        }

        return result;
    }
}
