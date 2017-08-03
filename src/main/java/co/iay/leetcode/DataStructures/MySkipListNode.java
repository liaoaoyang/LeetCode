package co.iay.leetcode.DataStructures;

import java.util.Random;

public class MySkipListNode {
    public class LevelPtr {
        private MySkipListNode next;
        private MySkipListNode prev;
        private int step;

        public LevelPtr() {
        }

        public LevelPtr(MySkipListNode next, MySkipListNode prev, int step) {
            this.next = next;
            this.next = prev;
            this.step = step;
        }

        public MySkipListNode getNext() {
            return next;
        }

        public void setNext(MySkipListNode next) {
            this.next = next;
        }

        public MySkipListNode getPrev() {
            return prev;
        }

        public void setPrev(MySkipListNode prev) {
            this.prev = prev;
        }

        public int getStep() {
            return step;
        }

        public void setStep(int step) {
            this.step = step;
        }
    }

    final public static int MAX_LEVEL = 32;
    final public static int RANDOM_LEVEL = 0;

    private LevelPtr[] levelPtrs;
    private int level;
    private String key;
    private Comparable value;

    public MySkipListNode(String key, Comparable value, int level) {
        this.level = level;
        this.key = key;
        this.value = value;

        initLevelPtr(level);
    }

    public MySkipListNode(String key, Comparable value) {
        this.key = key;
        this.value = value;

        initLevelPtr(RANDOM_LEVEL);
    }

    private void initLevelPtr(int level) {
        if (level == RANDOM_LEVEL) {
            Random random = new Random();
            level = random.nextInt(MAX_LEVEL + 1);
        } else if (level > 0) {
            Random random = new Random();
            level = random.nextInt(level + 1);
        } else {
            level = Math.abs(level);
        }

        level = level <= 0 ? 1 : level;
        level = level > MAX_LEVEL ? MAX_LEVEL : level;
        this.level = level;
        this.levelPtrs = new LevelPtr[level];

        for (int i = 0; i < levelPtrs.length; ++i) {
            this.levelPtrs[i] = new LevelPtr();
        }
    }

    // Getters & Setters
    public LevelPtr[] getLevelPtrs() {
        return levelPtrs;
    }

    public int getLevel() {
        return level;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Comparable getValue() {
        return value;
    }

    public void setValue(Comparable value) {
        this.value = value;
    }

    public MySkipListNode getNextOfLevel(int level) {
        int levelInArray = level - 1;

        if (levelInArray < 0 || level > this.levelPtrs.length) {
            return null;
        }

        return this.levelPtrs[levelInArray].getNext();
    }

    public MySkipListNode getPrevOfLevel(int level) {
        int levelInArray = level - 1;

        if (levelInArray < 0 || level > this.levelPtrs.length) {
            return null;
        }

        return this.levelPtrs[levelInArray].getPrev();
    }

    public boolean setNextOfLevel(int level, MySkipListNode node) {
        int levelInArray = level - 1;

        if (levelInArray < 0 || level > this.levelPtrs.length) {
            return false;
        }

        this.levelPtrs[levelInArray].setNext(node);

        return true;
    }

    public boolean setPrevOfLevel(int level, MySkipListNode node) {
        int levelInArray = level - 1;

        if (levelInArray < 0 || level > this.levelPtrs.length) {
            return false;
        }

        this.levelPtrs[levelInArray].setPrev(node);

        return true;
    }

    @Override
    public String toString() {
        return this.key + "[" + this.value + "]";
    }
}
