/**
 * Created by aoyang on 16/4/14.
 */
public class ZigZagConversion {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }

        int sLen = s.length();
        int colNum = (int) Math.ceil(1.0 * sLen / numRows);
        int sectionNum = 2 * numRows - 2;

        String result = "";

        for (int r = 0; r < numRows; ++r) {
            for (int c = 0; c < colNum; ++c) {
                int idx = c * sectionNum + r;

                if (idx < sLen) {
                    result += s.substring(idx, idx + 1);

                    if (r >= 1 && r <= numRows - 2) {
                        int idxAppend = (c + 1) * sectionNum - r;

                        if (idxAppend >= 0 && idxAppend < sLen) {
                            result += s.substring(idxAppend, idxAppend + 1);
                        }
                    }
                }
            }
        }

        return result;
    }
}
