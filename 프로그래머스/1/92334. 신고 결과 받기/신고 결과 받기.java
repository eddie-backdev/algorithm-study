import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int n = id_list.length;

        Map<String, Integer> idx = new HashMap<>();
        Set<String>[] reportedList = new HashSet[n];
        int[] reportedCount = new int[n];
        
        for (int i = 0; i < n; i++) {
            idx.put(id_list[i], i);
        }


        for (int i = 0; i < n; i++) {
            reportedList[i] = new HashSet<>();
        }

        // 1. 중복 신고 제거 + 신고 누적
        for (String r : report) {
            String[] sp = r.split(" ");
            String from = sp[0];
            String to = sp[1];

            int fromIdx = idx.get(from);
            int toIdx = idx.get(to);

            if (reportedList[fromIdx].add(to)) {
                reportedCount[toIdx]++;
            }
        }

        // 2. 정지된 유저
        boolean[] suspended = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (reportedCount[i] >= k) suspended[i] = true;
        }

        // 3. 결과 메일 수 계산
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            for (String t : reportedList[i]) {
                if (suspended[idx.get(t)]) {
                    answer[i]++;
                }
            }
        }

        return answer;
    }
}
