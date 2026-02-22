import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, HashSet<String>> reportedUser = new HashMap<>();
        Map<String, Integer> reportCnt = new HashMap<>();
        
        // map 초기화
        for (String id : id_list) {
            reportedUser.put(id, new HashSet<>());
            reportCnt.put(id, 0);
        }
        
        // 신고된 유저 reportedUser Set에 추가
        for (String r : report) {
            String[] users = r.split(" ");
            reportedUser.get(users[1]).add(users[0]);
        }
        
        // 신고된 유저 Set 사이즈가 k 이상이면 Cnt map에 몇 번 신고됐는지 추가
        for (String id : id_list) {
            Set<String> reportedSet = reportedUser.get(id);
            if (reportedSet.size() >= k) {
                for (String user : reportedSet) {
                    reportCnt.put(user, reportCnt.get(user) + 1);
                }
            }
        }
        
        // 정지된 유저가 있으면 신고한 유저에게 결과 반환
        for (int i = 0; i < answer.length; i++) {
            answer[i] = reportCnt.get(id_list[i]);
        }
        
        return answer;
    }
}