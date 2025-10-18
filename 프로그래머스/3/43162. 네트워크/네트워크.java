import java.util.*;

class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[n];
        
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                bfs(computers, visited, i);
                answer++;
            }
        }
        return answer;
    }
    
    void bfs(int[][] computers, boolean[] visited, int v) {
        Deque<Integer> dq = new ArrayDeque<>();
        dq.offer(v);
        visited[v] = true;
        
        while (!dq.isEmpty()) {
            Integer w = dq.poll();
            for (int i = 0; i < computers.length; i++) {
                if (computers[w][i] != 0  && !visited[i]) {
                    visited[i] = true;
                    dq.offer(i);
                }
            }
        }
    }
}