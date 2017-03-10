package co.iay.leetcode.Easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ng on 17/3/11.
 * 93. Restore IP Addresses
 * https://leetcode.com/problems/restore-ip-addresses
 */
public class RestoreIPAddresses {
    private void buildIP(List<String> r, String s, int start, int part, String ip) {
        if (part == 5 && ip.length() == s.length() + 3) {
            r.add(ip);
            return;
        }

        for (int l = 1; l <= 3; ++l) {
            int endIdx = (part == 4 ? s.length() : Math.min(s.length(), start + l));
            String nowStr = s.substring(start, endIdx);

            if (nowStr.length() == 0) {
                continue;
            }

            long now = Long.parseLong(nowStr);

            if (now > 255) {
                continue;
            }

            nowStr = now + "";

            buildIP(r, s, endIdx, part + 1, (part == 1 ? nowStr + "" : ip + "." + nowStr));

            if (part == 4) {
                break;
            }
        }
    }

    public List<String> restoreIpAddresses(String s) {
        List<String> r = new ArrayList<String>();

        if (s.length() < 4 || s.length() > 12) {
            return r;
        }

        buildIP(r, s, 0, 1, "");
        return r;
    }
}
