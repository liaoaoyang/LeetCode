package co.iay.leetcode.Tester.DataStructures;

import co.iay.leetcode.DataStructures.MySkipList;
import co.iay.leetcode.DataStructures.MySkipListNode;
import javafx.util.Pair;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestMySkipList {
    private MySkipList mySkipList;

    @Test
    public void testCase1() {
        mySkipList = new MySkipList();
        Assert.assertEquals("", mySkipList.toString());
    }

    @Test
    public void testCase2() {
        mySkipList = new MySkipList();
        mySkipList.add("a", 1, -3);
        StringBuffer sb = new StringBuffer();
        sb.append("L3:a[1]->NULL\n");
        sb.append("L2:a[1]->NULL\n");
        sb.append("L1:a[1]->NULL\n");
        Assert.assertEquals(sb.toString(), mySkipList.toString());
    }

    @Test
    public void testCase3() {
        mySkipList = new MySkipList();
        mySkipList.add("a", 2, -3);
        mySkipList.add("b", 1, -3);
        StringBuffer sb = new StringBuffer();
        sb.append("L3:b[1]->a[2]->NULL\n");
        sb.append("L2:b[1]->a[2]->NULL\n");
        sb.append("L1:b[1]->a[2]->NULL\n");
        Assert.assertEquals(sb.toString(), mySkipList.toString());
    }

    @Test
    public void testCase4() {
        mySkipList = new MySkipList();
        mySkipList.add("a", 3, -3);
        mySkipList.add("b", 1, -3);
        mySkipList.add("c", 2, -3);
        StringBuffer sb = new StringBuffer();
        sb.append("L3:b[1]->c[2]->a[3]->NULL\n");
        sb.append("L2:b[1]->c[2]->a[3]->NULL\n");
        sb.append("L1:b[1]->c[2]->a[3]->NULL\n");
        Assert.assertEquals(sb.toString(), mySkipList.toString());
    }

    @Test
    public void testCase5() {
        mySkipList = new MySkipList();
        mySkipList.add("a", 3, -1);
        mySkipList.add("b", 1, -2);
        mySkipList.add("c", 2, -3);
        StringBuffer sb = new StringBuffer();
        sb.append("L3:c[2]->NULL\n");
        sb.append("L2:b[1]->c[2]->NULL\n");
        sb.append("L1:b[1]->c[2]->a[3]->NULL\n");
        Assert.assertEquals(sb.toString(), mySkipList.toString());
    }

    @Test
    public void testCase6() {
        mySkipList = new MySkipList();
        mySkipList.add("a", 3, -1);
        mySkipList.add("b", 1, -2);
        mySkipList.add("c", 2, -3);
        mySkipList.add("d", 4, -2);
        mySkipList.add("e", 6, -3);
        mySkipList.add("f", 5, -3);
        StringBuffer sb = new StringBuffer();
        sb.append("L3:c[2]->f[5]->e[6]->NULL\n");
        sb.append("L2:b[1]->c[2]->d[4]->f[5]->e[6]->NULL\n");
        sb.append("L1:b[1]->c[2]->a[3]->d[4]->f[5]->e[6]->NULL\n");
        Assert.assertEquals(sb.toString(), mySkipList.toString());
    }

    @Test
    public void testFindCase1() {
        mySkipList = new MySkipList();
        mySkipList.add("a", 3, -1);
        mySkipList.add("b", 1, -2);
        mySkipList.add("c", 2, -3);
        mySkipList.add("d", 4, -2);
        mySkipList.add("e", 6, -3);
        mySkipList.add("f", 5, -3);
        MySkipListNode n = mySkipList.find(4);

        if (null == n) {
            Assert.fail();
        }

        Assert.assertEquals("d", n.getKey());
    }

    @Test
    public void testFindCase2() {
        mySkipList = new MySkipList();
        mySkipList.add("a", 3, -1);
        mySkipList.add("b", 1, -2);
        mySkipList.add("c", 2, -3);
        mySkipList.add("d", 4, -2);
        mySkipList.add("e", 6, -3);
        mySkipList.add("f", 5, -3);
        MySkipListNode n = mySkipList.find(3);

        if (null == n) {
            Assert.fail();
        }

        Assert.assertEquals("a", n.getKey());
    }

    @Test
    public void testFindCase3() {
        mySkipList = new MySkipList();
        mySkipList.add("a", 3, -1);
        mySkipList.add("b", 1, -2);
        mySkipList.add("c", 2, -3);
        mySkipList.add("d", 4, -2);
        mySkipList.add("e", 6, -3);
        mySkipList.add("f", 5, -3);
        MySkipListNode n = mySkipList.find(7);

        if (null != n) {
            Assert.fail();
        }
    }

    @Test
    public void testDeleteCase1() {
        mySkipList = new MySkipList();
        mySkipList.add("a", 3, -1);
        mySkipList.add("b", 1, -2);
        mySkipList.add("c", 2, -3);
        mySkipList.add("d", 4, -2);
        mySkipList.add("e", 6, -3);
        mySkipList.add("f", 5, -3);
        Assert.assertEquals(new Pair<Integer, Integer>(3, 6), mySkipList.delete(7));
    }

    @Test
    public void testDeleteCase2() {
        mySkipList = new MySkipList();
        mySkipList.add("a", 3, -1);
        mySkipList.add("b", 1, -2);
        mySkipList.add("c", 2, -3);
        mySkipList.add("d", 4, -2);
        mySkipList.add("e", 6, -3);
        mySkipList.add("f", 5, -3);
        Assert.assertEquals(new Pair<Integer, Integer>(3, 5), mySkipList.delete(2));
        StringBuffer sb = new StringBuffer();
        sb.append("L3:f[5]->e[6]->NULL\n");
        sb.append("L2:b[1]->d[4]->f[5]->e[6]->NULL\n");
        sb.append("L1:b[1]->a[3]->d[4]->f[5]->e[6]->NULL\n");
        Assert.assertEquals(sb.toString(), mySkipList.toString());
    }

    @Test
    public void testDeleteCase3() {
        mySkipList = new MySkipList();
        mySkipList.add("a", 3, -1);
        mySkipList.add("b", 1, -2);
        mySkipList.add("c", 2, -3);
        mySkipList.add("d", 4, -2);
        mySkipList.add("e", 6, -3);
        mySkipList.add("f", 5, -3);
        Assert.assertEquals(new Pair<Integer, Integer>(3, 5), mySkipList.delete(2));
        Assert.assertEquals(new Pair<Integer, Integer>(3, 4), mySkipList.delete(5));
        Assert.assertEquals(new Pair<Integer, Integer>(2, 3), mySkipList.delete(6));
        StringBuffer sb = new StringBuffer();
        sb.append("L2:b[1]->d[4]->NULL\n");
        sb.append("L1:b[1]->a[3]->d[4]->NULL\n");
        Assert.assertEquals(sb.toString(), mySkipList.toString());
    }

    @Test
    public void testDeleteCase4() {
        mySkipList = new MySkipList();
        mySkipList.add("a", 3, -1);
        mySkipList.add("b", 1, -2);
        mySkipList.add("c", 2, -3);
        mySkipList.add("d", 4, -2);
        mySkipList.add("e", 6, -3);
        mySkipList.add("f", 5, -3);
        Assert.assertEquals(new Pair<Integer, Integer>(3, 5), mySkipList.delete(2));
        Assert.assertEquals(new Pair<Integer, Integer>(3, 4), mySkipList.delete(5));
        Assert.assertEquals(new Pair<Integer, Integer>(2, 3), mySkipList.delete(6));
        Assert.assertEquals(new Pair<Integer, Integer>(2, 2), mySkipList.delete(4));
        Assert.assertEquals(new Pair<Integer, Integer>(1, 1), mySkipList.delete(1));
        StringBuffer sb = new StringBuffer();
        sb.append("L1:a[3]->NULL\n");
        Assert.assertEquals(sb.toString(), mySkipList.toString());
    }

    @Test
    public void testRandomInsertCase1() {
        mySkipList = new MySkipList(4);
        int len = 10;
        List<Integer> vals = new ArrayList<Integer>();

        for (int i = 1; i <= len; ++i) {
            vals.add(i);
        }

        Collections.shuffle(vals);

        for (Integer i : vals) {
            System.out.println("==========");
            char c = (char) ('A' + i - 1);
            mySkipList.add(c + "", i);
            System.out.println(mySkipList.toString());
        }

    }
}
