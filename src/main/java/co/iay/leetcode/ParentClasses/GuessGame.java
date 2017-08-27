package co.iay.leetcode.ParentClasses;

/**
 * Created by ng on 16/7/15.
 */
public class GuessGame {
    private int chosenNumber = 0;

    public int getChosenNumber() {
        return chosenNumber;
    }

    public void setChosenNumber(int chosenNumber) {
        this.chosenNumber = chosenNumber;
    }

    public void init(int n) {
        this.chosenNumber = (int) (Math.random() * n);
        this.chosenNumber = (this.chosenNumber == 0 ? 1 : this.chosenNumber);
    }

    public void show() {
        System.out.println("chosen=" + this.chosenNumber);
    }

    public int guess(int num) {
        if (num == this.chosenNumber) {
            return 0;
        }

        return (num > this.chosenNumber ? 1 : -1);
    }
}
