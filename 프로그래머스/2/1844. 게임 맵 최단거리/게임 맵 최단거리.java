import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        
        int[][] visited = new int[n][m];
        Queue<int[]> q = new ArrayDeque<>();
        
        q.add(new int[]{0, 0});
        visited[0][0] = 1;
        
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int x = cur[0];
            int y = cur[1];
            
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
                    if (maps[nx][ny] == 1 && visited[nx][ny] == 0) {
                        visited[nx][ny] = visited[x][y] + 1;
                        q.add(new int[]{nx, ny});
                    }
                }
            }
        }
        
        return visited[n - 1][m - 1] != 0 ? visited[n - 1][m - 1] : -1;
    }
}