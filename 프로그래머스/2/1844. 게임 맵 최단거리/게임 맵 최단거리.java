import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int w = maps.length;
        int h = maps[0].length;
        
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        
        int[][] visited = new int[w][h];
        visited[0][0] = 1;
        ArrayDeque<int[]> dq = new ArrayDeque<>();
        
        dq.offer(new int[] {0, 0});
        
        while (!dq.isEmpty()) {
            int[] current = dq.poll();
            int x = current[0];
            int y = current[1];
            
            if (x == w - 1 && y == h - 1) {
                return visited[x][y];
            }
            
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                if (nx >= 0 && ny >= 0 && nx < w && ny < h) {
                    if (visited[nx][ny] == 0 && maps[nx][ny] == 1) {
                        visited[nx][ny] = visited[x][y] + 1;
                        dq.offer(new int[] {nx, ny});
                    }
                }
            }
        }
        
        return -1;
    }
}