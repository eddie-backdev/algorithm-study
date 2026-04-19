import java.util.*;

class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        
        boolean[] visited = new boolean[n];
        
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dq.offer(i);
                
                while(!dq.isEmpty()) {
                    int node = dq.poll();
                    visited[node] = true;
                    for (int j = 0; j < n; j++) {
                        if (!visited[j] && computers[node][j] == 1) {
                            visited[j] = true;
                            dq.offer(j);
                        }
                    }
                }
                
                answer++;
            }   
        }
        return answer;
    }
}