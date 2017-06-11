package co.iay.leetcode.Easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ng on 2017/6/11.
 * 609. Find Duplicate File in System
 * https://leetcode.com/problems/find-duplicate-file-in-system/
 */
public class FindDuplicateFileInSystem {
    private class FileInfo {
        public Integer pathId;
        public Integer contentId;
        public String filename;
    }

    public List<List<String>> findDuplicate(String[] paths) {
        int pathId = 1;
        Map<String, Integer> pathIdMap = new HashMap<String, Integer>();
        Map<Integer, String> idPathMap = new HashMap<Integer, String>();
        int contentId = 1;
        Map<String, Integer> contentIdMap = new HashMap<String, Integer>();
        Map<Integer, String> idContentMap = new HashMap<Integer, String>();
        Map<Integer, List<FileInfo>> resultMap = new HashMap<Integer, List<FileInfo>>();

        for (String path : paths) {
            String[] list = path.split(" ");

            if (!pathIdMap.containsKey(list[0])) {
                pathIdMap.put(list[0], pathId);
                idPathMap.put(pathId, list[0]);
                ++pathId;
            }

            int nowFilePathId = pathIdMap.get(list[0]);

            for (int i = 1; i < list.length; ++i) {
                String[] fileInfoList = list[i].split("\\(");
                String nowFileContent = fileInfoList[1].substring(0, fileInfoList[1].length() - 1);
                FileInfo fileInfo = new FileInfo();
                fileInfo.pathId = nowFilePathId;

                if (!contentIdMap.containsKey(nowFileContent)) {
                    contentIdMap.put(nowFileContent, contentId);
                    idContentMap.put(contentId, nowFileContent);
                    ++contentId;
                }

                int nowFileContentId = contentIdMap.get(nowFileContent);
                fileInfo.contentId = nowFileContentId;
                fileInfo.filename = fileInfoList[0];

                if (!resultMap.containsKey(nowFileContentId)) {
                    resultMap.put(nowFileContentId, new ArrayList<FileInfo>());
                }

                resultMap.get(nowFileContentId).add(fileInfo);
            }
        }

        List<List<String>> result = new ArrayList<List<String>>();

        for (Map.Entry<Integer, List<FileInfo>> entry : resultMap.entrySet()) {
            List<FileInfo> fileInfos = entry.getValue();

            if (fileInfos.size() < 2) {
                continue;
            }

            List<String> r = new ArrayList<String>();

            for (FileInfo f : fileInfos) {
                r.add(idPathMap.get(f.pathId) + "/" + f.filename);
            }

            result.add(r);
        }

        return result;
    }
}
