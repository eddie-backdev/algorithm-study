import java.util.LinkedList;
import java.util.Queue;

class Solution {
    static boolean[] visited;
    static int netCnt;
    public int solution(int n, int[][] computers) {
        visited = new boolean[n];
        
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                bfs(i, computers);
                netCnt++;
            }
        }
        return netCnt;
    }
    
    void bfs(int start ,int[][] coms) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        visited[start] = true;
        
        while (!q.isEmpty()) {
            int v = q.poll();
            for (int i = 0; i < coms.length; i++) {
                if (!visited[i] && coms[v][i] == 1) {
                    q.offer(i);
                    visited[i] = true;
                }
            }
        }
    }

}