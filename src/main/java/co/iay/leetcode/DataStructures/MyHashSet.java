package co.iay.leetcode.DataStructures;

/**
 * 705. Design HashSet
 * https://leetcode.com/problems/design-hashset/
 * Design a HashSet without using any built-in hash table libraries.
 * <p>
 * To be specific, your design should include these functions:
 * <p>
 * add(value): Insert a value into the HashSet.
 * contains(value) : Return whether the value exists in the HashSet or not.
 * remove(value): Remove a value in the HashSet. If the value does not exist in the HashSet, do nothing.
 * <p>
 * Example:
 * <p>
 * MyHashSet hashSet = new MyHashSet();
 * hashSet.add(1);
 * hashSet.add(2);
 * hashSet.contains(1);    // returns true
 * hashSet.contains(3);    // returns false (not found)
 * hashSet.add(2);
 * hashSet.contains(2);    // returns true
 * hashSet.remove(2);
 * hashSet.contains(2);    // returns false (already removed)
 * <p>
 * Note:
 * <p>
 * All values will be in the range of [0, 1000000].
 * The number of operations will be in the range of [1, 10000].
 * Please do not use the built-in HashSet library.
 */
public class MyHashSet {
    private char[] hashSet;

    /**
     * Initialize your data structure here.
     */
    public MyHashSet() {
        hashSet = new char[125001];
    }

    public void add(int key) {
        int i = key / 8;
        int pos = key % 8;
        hashSet[i] |= (1 << pos);
    }

    public void remove(int key) {
        int i = key / 8;
        int pos = key % 8;
        hashSet[i] &= (~(1 << pos));
    }

    /**
     * Returns true if this set contains the specified element
     */
    public boolean contains(int key) {
        int i = key / 8;
        int pos = key % 8;
        return (((int) hashSet[i]) & (1 << pos)) > 0;
    }
}
