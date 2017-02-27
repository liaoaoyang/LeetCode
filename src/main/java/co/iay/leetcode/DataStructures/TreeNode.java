package co.iay.leetcode.DataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Created by ng on 16/6/13.
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int x) {
        val = x;
    }

    public static TreeNode[] buildTreeArray(Integer[] list) {
        return buildTreeArray(list, null);
    }

    @SuppressWarnings("Duplicates")
    public static TreeNode[] buildTreeArray(Integer[] list, Map<Integer, TreeNode> idxNodeMap) {
        if (list.length == 0) {
            return null;
        }

        TreeNode[] tmpTree = new TreeNode[list.length];

        for (int i = 0; i < list.length; ++i) {
            if (list[i] == null) {
                continue;
            }

            tmpTree[i] = new TreeNode(list[i]);
        }

        int nonEmpty = 0;

        for (int i = 0; i < tmpTree.length; ++i) {
            if (tmpTree[i] == null) {
                continue;
            }

            ++nonEmpty;
            int leftIdx = i * 2 + 1;
            int rightIdx = i * 2 + 2;
            tmpTree[i].left = (leftIdx < tmpTree.length && tmpTree[leftIdx] != null ? tmpTree[leftIdx] : null);
            tmpTree[i].right = (rightIdx < tmpTree.length && tmpTree[rightIdx] != null ? tmpTree[rightIdx] : null);
        }

        TreeNode[] tree = new TreeNode[nonEmpty];

        for (int i = 0, j = 0; i < tmpTree.length; ++i) {
            if (tmpTree[i] == null) {
                continue;
            }

            tree[j] = tmpTree[i];

            if (idxNodeMap != null) {
                idxNodeMap.put(i, tree[j]);
            }

            ++j;
        }

        return tree;
    }

    public static TreeNode buildTree(Integer[] list) {
        TreeNode[] tree = buildTreeArray(list);

        if (tree == null || tree.length == 0) {
            return null;
        }

        return tree[0];
    }

    public static Integer[] treeToArray(TreeNode root) {
        return treeToArray(root, false);
    }

    public static Integer[] treeToArrayReverse(TreeNode root) {
        return treeToArray(root, true);
    }

    @SuppressWarnings("Duplicates")
    private static Integer[] treeToArray(TreeNode root, boolean reverse) {
        if (root == null) {
            return new Integer[] {};
        }

        List<TreeNode> l = new ArrayList<TreeNode>();
        List<Integer> treeList = new ArrayList<Integer>();
        l.add(root);
        treeList.add(root.val);

        int levelSize = 1;

        while (true) {
            levelSize *= 2;
            Integer[] levelArray = new Integer[levelSize];

            for (int levelArrayIdx = 0; levelArrayIdx < levelSize; ++levelArrayIdx) {
                levelArray[levelArrayIdx] = null;
            }

            List<TreeNode> pl = l;
            l = new ArrayList<TreeNode>();

            int levelIdx = (reverse ? levelSize - 1 : 0);
            int levelStep = (reverse ? -1 : 1);

            boolean allNull = true;

            for(TreeNode node : pl) {
                if (node == null) {
                    levelIdx += levelStep;
                    l.add(null);
                    levelIdx += levelStep;
                    l.add(null);
                    continue;
                }

                if (node.left != null) {
                    l.add(node.left);
                    levelArray[levelIdx] = node.left.val;
                    allNull = false;
                } else {
                    l.add(null);
                }

                levelIdx += levelStep;

                if (node.right != null) {
                    l.add(node.right);
                    levelArray[levelIdx] = node.right.val;
                    allNull = false;
                } else {
                    l.add(null);
                }

                levelIdx += levelStep;
            }

            if (allNull) {
                break;
            }
            else {
                treeList.addAll(Arrays.asList(levelArray));
            }
        }

        return treeList.toArray(new Integer[treeList.size()]);
    }
}
