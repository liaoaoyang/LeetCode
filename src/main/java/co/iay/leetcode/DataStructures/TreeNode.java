package co.iay.leetcode.DataStructures;

/**
 * Created by ng on 16/6/13.
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    TreeNode(int x) {
        val = x;
    }

    public static TreeNode buildTree(Integer[] list) {
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
            ++j;
        }

        return tree[0];
    }
}
