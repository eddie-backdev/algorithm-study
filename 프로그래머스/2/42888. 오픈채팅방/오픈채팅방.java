import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

class Solution {
        public String[] solution(String[] record) {
            ArrayList<String> ans = new ArrayList<>();
        Map<String, String> user = new HashMap<>();

        StringTokenizer st;

        for (String input : record) {
            st = new StringTokenizer(input);
            String act = st.nextToken();
            if (act.equals("Enter") || act.equals("Change")) {
                String key = st.nextToken();
                String value = st.nextToken();
                user.put(key, value);
            }
        }

        for (String input : record) {
            st = new StringTokenizer(input);
            String act = st.nextToken();
            String key = st.nextToken();
            if (act.equals("Enter")) {
                ans.add(user.get(key) + "님이 들어왔습니다.");
            } else if (act.equals("Leave")) {
                ans.add(user.get(key) + "님이 나갔습니다.");
            }
        }

        return ans.toArray(new String[ans.size()]);
    }
}