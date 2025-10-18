import java.util.*;

class Solution {
    
    int[] dx = {0, 1, -1, 0};
    int[] dy = {1, 0, 0, -1};
    int[][] visited;
    
    public int solution(int[][] maps) {
        visited = new int[maps.length][maps[0].length];
        bfs(maps);
        int answer = visited[maps.length - 1][maps[0].length - 1] > 0 ? visited[maps.length - 1][maps[0].length - 1] : -1;
        return answer;
    }
    
    void bfs(int[][] maps) {
        Deque<int[]> dq = new ArrayDeque<>();
        dq.offer(new int[]{0,0});
        visited[0][0] = 1;
        
        while (!dq.isEmpty()) {
            int[] current = dq.poll();
            int x = current[0];
            int y = current[1];
            
            for (int i = 0; i < 4; i++) {
                int nx = dx[i] + x;
                int ny = dy[i] + y;
                if (nx < 0 || ny < 0 || nx >= maps.length || ny >= maps[0].length || maps[nx][ny] == 0) continue;
                if (visited[nx][ny] > 0) continue;
                visited[nx][ny] = visited[x][y] + 1;
                dq.offer(new int[]{nx, ny});
            }
        }
    }
}