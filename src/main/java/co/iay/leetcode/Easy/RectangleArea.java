package co.iay.leetcode.Easy;

/**
 * Created by ng on 16/5/15.
 * https://leetcode.com/problems/rectangle-area/
 */
public class RectangleArea {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int totalArea = (C - A) * (D - B) + (G - E) * (H - F);

        if (A <= E && B <= F && C >= G && D >= H) {
            return (C - A) * (D - B);
        }

        if (A > E && B > F && C < G && D < H) {
            return (G - E) * (H - F);
        }

        if (E >= C || H <= B || G <= A || F >= D) {
            return totalArea;
        }

        int leftX = A > E ? A : E;
        int leftY = B > F ? B : F;
        int rightX = C > G ? G : C;
        int rightY = D > H ? H : D;

        return totalArea - (rightX - leftX) * (rightY - leftY);
    }
}
