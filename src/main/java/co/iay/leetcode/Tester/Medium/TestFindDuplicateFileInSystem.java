package co.iay.leetcode.Tester.Medium;

import co.iay.leetcode.Easy.FindDuplicateFileInSystem;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ng on 2017/6/11.
 */
public class TestFindDuplicateFileInSystem {
    private FindDuplicateFileInSystem f = new FindDuplicateFileInSystem();

    @Test
    public void testFindDuplicateFileInSystemCase1() {
        String[][] cmp = new String[][]{
                {"root/a/1.txt", "root/c/3.txt"},
                {"root/a/2.txt", "root/c/d/4.txt", "root/4.txt"},
        };
        List<List<String>> cmpList = new ArrayList<List<String>>();

        for (String[] cc : cmp) {
            List<String> s = new ArrayList<String>();
            for (String c : cc) {
                s.add(c);
            }
            cmpList.add(s);
        }

        Assert.assertEquals(cmpList, f.findDuplicate(new String[]{
                "root/a 1.txt(abcd) 2.txt(efgh)",
                "root/c 3.txt(abcd)",
                "root/c/d 4.txt(efgh)",
                "root 4.txt(efgh)"
        }));
    }

    @Test
    public void testFindDuplicateFileInSystemCase2() {
        List<List<String>> cmpList = new ArrayList<List<String>>();

        Assert.assertEquals(cmpList, f.findDuplicate(new String[]{
                "root/a 1.txt(FB) 2.txt(a)",
                "root/c 3.txt(Ea)",
                "root/c/d 4.txt(b)",
                "root 4.txt(c)"
        }));
    }
}
