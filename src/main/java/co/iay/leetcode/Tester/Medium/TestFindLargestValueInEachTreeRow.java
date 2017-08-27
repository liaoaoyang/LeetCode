package co.iay.leetcode.Tester.Medium;

import co.iay.leetcode.DataStructures.TreeNode;
import co.iay.leetcode.Medium.FindLargestValueInEachTreeRow;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by ng on 17/3/26.
 */
public class TestFindLargestValueInEachTreeRow {
    FindLargestValueInEachTreeRow f = new FindLargestValueInEachTreeRow();

    @Test
    public void testFindLargestValueInEachTreeRowCase1() {
        TreeNode tree = TreeNode.buildTree(new Integer[]{1, 3, 2, 5, 3, null, 9});
        List<Integer> cmp = Arrays.asList(new Integer[]{1, 3, 9});
        Assert.assertEquals(cmp, f.largestValues(tree));
    }
}
