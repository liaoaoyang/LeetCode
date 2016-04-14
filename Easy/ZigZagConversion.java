/**
 * Created by aoyang on 16/4/14.
 */
public class ZigZagConversion {
    public static final int STAGE_COL    = 0;
    public static final int STAGE_ZIGZAG = 1;
    
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }

        int sLen = s.length();
        int zigZagLen = (numRows - 2 >= 0 ? numRows - 2 : 0);

        String r = "";
        int stage = 0;
        int zigZagIdx = 1;
        int colIdx = 0;

        for (int i = 0; i < sLen; ++i) {
            String nowStr = s.substring(i, i + 1);
            if (stage == STAGE_COL) {
                r = r + nowStr;
                ++colIdx;

                if (colIdx > 0 && colIdx % numRows == 0) {
                    stage = STAGE_ZIGZAG;
                    zigZagIdx = 1;
                }
            } else {
                if (zigZagLen == 0) {
                    stage = STAGE_COL;
                    colIdx = 0;
                    continue;
                }

                for (int j = 0; j < numRows; ++j) {
                    if (j != zigZagIdx) {
                        r = r + "#";
                        continue;
                    }

                    r = r + nowStr;
                }

                ++zigZagIdx;

                if (zigZagIdx > zigZagLen) {
                    stage = STAGE_COL;
                    colIdx = 0;
                }
            }
        }

        String result = "";
        int rLen = r.length();

        for (int row = 0; row < numRows; ++ row) {
            for (int i = row; i < rLen; i += numRows) {
                String nowStr = r.substring(i, i + 1);
                if (!nowStr.equals("#")) {
                    result = result + nowStr;
                }
            }
        }

        return result;
    }
}
