import java.util.*;

class Solution {
    
    int length;
    boolean[] visited;
    List<String> answer;
    
    public String[] solution(String[][] tickets) {
        length = tickets.length;
        visited = new boolean[length];
        answer = new ArrayList<>();
        
        dfs("ICN", "ICN", tickets, 0);
        
        Collections.sort(answer);
        return answer.get(0).split(" ");
    }
    
    public void dfs(String start, String route, String[][] tickets, int count) {
        if (count == length) {
            answer.add(route);
            return;
        }
        
        for (int i = 0; i < length; i++) {
            if (!visited[i] && start.equals(tickets[i][0])) {
                visited[i] = true;
                dfs(tickets[i][1], route + " " + tickets[i][1], tickets, count+1);
                visited[i] = false;
            }
        }
    }
}