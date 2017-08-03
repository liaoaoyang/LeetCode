package co.iay.leetcode.DataStructures;

import javafx.util.Pair;

public class MySkipList {
    // TODO 1: add distance
    private MySkipListNode start;
    private MySkipListNode end;
    private int maxLevel;
    private int maxNodeLevel;
    private int size;

    public MySkipList(int maxNodeLevel) {
        maxNodeLevel = maxNodeLevel <= 0 ? 1 : maxNodeLevel;
        maxNodeLevel = maxNodeLevel > MySkipListNode.MAX_LEVEL ? MySkipListNode.MAX_LEVEL : maxNodeLevel;
        this.maxNodeLevel = maxNodeLevel;
        init();
    }

    public MySkipList() {
        this.maxNodeLevel = MySkipListNode.RANDOM_LEVEL;
        init();
    }

    private void init() {
        // Negative level specify the level of a node
        start = new MySkipListNode("START", 0, -MySkipListNode.MAX_LEVEL);
        end = new MySkipListNode("END", 0, -MySkipListNode.MAX_LEVEL);

        for (int i = 0; i < MySkipListNode.MAX_LEVEL; ++i) {
            start.setNextOfLevel(i + 1, end);
            end.setPrevOfLevel(i + 1, start);
        }
    }

    public MySkipListNode getHead() {
        return start.getNextOfLevel(1) == end ? null : start.getNextOfLevel(1);
    }

    public MySkipListNode getTail() {
        return end.getPrevOfLevel(1) == start ? null : end.getPrevOfLevel(1);
    }

    public int getMaxLevel() {
        return maxLevel;
    }

    public int getSize() {
        return size;
    }

    public MySkipListNode find(Comparable value) {
        int nodeLevel = maxLevel;
        MySkipListNode prevStartNode = start;

        for (int i = nodeLevel - 1; i >= 0; --i) {
            int nowLevel = i + 1;
            MySkipListNode now = prevStartNode.getNextOfLevel(nowLevel);

            if (now == null || now == end) {
                continue;
            }

            while (now != null && now != end && now.getValue().compareTo(value) < 0) {
                prevStartNode = now;
                now = now.getNextOfLevel(nowLevel);
            }

            if (now != null && now != end && now.getValue().compareTo(value) == 0) {
                return now;
            }
        }

        return null;
    }

    public Pair<Integer, Integer> delete(Comparable value) {
        MySkipListNode nodeForDelete = find(value);

        if (null == nodeForDelete) {
            return new Pair<Integer, Integer>(maxLevel, size);
        }

        int nodeLevel = maxLevel;

        for (int i = nodeLevel - 1; i >= 0; --i) {
            int nowLevel = i + 1;
            MySkipListNode prevOfDeletedNode = nodeForDelete.getPrevOfLevel(nowLevel);
            MySkipListNode nextOfDeletedNode = nodeForDelete.getNextOfLevel(nowLevel);
            nextOfDeletedNode.setPrevOfLevel(nowLevel, prevOfDeletedNode);
            prevOfDeletedNode.setNextOfLevel(nowLevel, nextOfDeletedNode);
        }

        --size;

        int nowMaxLevel = maxLevel;
        maxLevel = 0;

        for (int i = nowMaxLevel - 1; i >= 0; --i) {
            if (start.getNextOfLevel(i + 1) != end) {
                maxLevel = i + 1;
                break;
            }
        }

        nodeForDelete = null;
        return new Pair<Integer, Integer>(maxLevel, size);
    }

    public Pair<Integer, MySkipListNode> add(String key, Comparable value) {
        return add(key, value, maxNodeLevel);
    }

    public Pair<Integer, MySkipListNode> add(String key, Comparable value, int level) {
        MySkipListNode node = new MySkipListNode(key, value, level);
        int nodeLevel = node.getLevel();

        MySkipListNode prevStartNode = start;

        for (int i = nodeLevel - 1; i >= 0; --i) {
            int nowLevel = i + 1;
            MySkipListNode now = prevStartNode.getNextOfLevel(nowLevel);

            while (now != null && now != end && now.getValue().compareTo(node.getValue()) < 0) {
                prevStartNode = now;
                now = now.getNextOfLevel(nowLevel);
            }

            if (now != null) {
                node.setNextOfLevel(nowLevel, now);
                node.setPrevOfLevel(nowLevel, prevStartNode);
                prevStartNode.setNextOfLevel(nowLevel, node);
                now.setPrevOfLevel(nowLevel, node);
            }
        }

        maxLevel = maxLevel > nodeLevel ? maxLevel : nodeLevel;
        ++size;

        return new Pair<Integer, MySkipListNode>(size, node);
    }

    public String toString() {
        MySkipListNode.LevelPtr[] levelPtrs = start.getLevelPtrs();
        StringBuffer sb = new StringBuffer();

        for (int i = MySkipListNode.MAX_LEVEL - 1; i >= 0; --i) {
            if (levelPtrs[i].getNext() == end) {
                continue;
            }

            MySkipListNode now = levelPtrs[i].getNext();
            int nowLevel = i + 1;

            sb.append("L");
            sb.append(nowLevel);
            sb.append(":");

            while (now != null && now != end) {
                sb.append(now.getKey());
                sb.append('[');
                sb.append(now.getValue());
                sb.append(']');
                sb.append("->");
                now = now.getNextOfLevel(nowLevel);
            }

            sb.append("NULL\n");
        }

        return sb.toString();
    }
}
