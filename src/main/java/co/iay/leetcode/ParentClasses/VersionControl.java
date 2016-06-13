package co.iay.leetcode.ParentClasses;

/**
 * Created by ng on 16/6/13.
 */
public class VersionControl {
    private int badVersion = 0;
    private int versions = 0;

    public void init(int n) {
        this.versions = n;
        this.badVersion = (int)(Math.random()  * n);
        this.badVersion = this.badVersion <= 0 ? 1 : this.badVersion;
    }

    public void init(int n, int badV) {
        this.versions = n;
        this.badVersion = badV;
    }

    public void show() {
        System.out.println("badVersion=" + this.badVersion + " version=" + this.versions);
    }

    public boolean isBadVersion(int version) {
        return version >= badVersion;
    }
}
