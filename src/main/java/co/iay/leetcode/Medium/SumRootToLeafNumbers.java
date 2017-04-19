package co.iay.leetcode.Medium;

import co.iay.leetcode.DataStructures.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ng on 17/4/17.
 * 129. Sum Root to Leaf Numbers
 * https://leetcode.com/problems/sum-root-to-leaf-numbers/
 */
public class SumRootToLeafNumbers {
    private static void getNumbers(List<Integer> nums, int nowNum, TreeNode root) {
        if (null == root) {
            return;
        }

        if (null == root.left && null == root.right) {
            nums.add(nowNum * 10 + root.val);
            return;
        }

        if (null != root.left) {
            getNumbers(nums, nowNum * 10 + root.val, root.left);
        }

        if (null != root.right) {
            getNumbers(nums, nowNum * 10 + root.val, root.right);
        }
    }

    public int sumNumbers(TreeNode root) {
        List<Integer> nums = new ArrayList<Integer>();
        getNumbers(nums, 0, root);

        int result = 0;

        for (Integer n : nums) {
            result += n;
        }

        return result;
    }
}
