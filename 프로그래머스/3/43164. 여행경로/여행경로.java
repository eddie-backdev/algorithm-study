import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    static ArrayList<String> result = new ArrayList<>();
    static boolean[] visited;
    static int tSize;
    
    public String[] solution(String[][] tickets) {
        tSize = tickets.length;
        visited = new boolean[tSize];
        
        dfs(0, "ICN", "ICN", tickets);
        Collections.sort(result);

        String[] answer = result.get(0).split(" ");
        return answer;
    }
    
    static void dfs(int idx, String start, String current, String[][] tickets) {
        if (idx == tSize) {
            result.add(current);
            return;
        }
        
        for (int i = 0; i < tSize; i++) {
            if (tickets[i][0].equals(start) && !visited[i]) {
                visited[i] = true;
                dfs(idx + 1, tickets[i][1], current + " " + tickets[i][1], tickets);
                visited[i] = false;
            }
        }
        return;
    }
}