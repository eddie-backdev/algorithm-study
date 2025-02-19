import java.util.LinkedList;
import java.util.Queue;

class Solution {
    static int N, M;
    static int[][] map;
    static int[][] distance;
    // static int[] dx = {0, 1, -1, 0}; // 우하상좌
    // static int[] dy = {1, 0, 0, -1};
    
    static int[] dx = {-1, 1, 0, 0}; // 상하좌우
    static int[] dy = {0, 0, -1, 1};
    
    public int solution(int[][] maps) {
        N = maps.length;
        M = maps[0].length;
        map = maps;
        distance = new int[N][M];
        
        bfs(0,0);
        int answer = distance[N-1][M-1];
        if (answer == 0) return -1;
        return answer;
    }
    
    void bfs(int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{x, y});
        distance[x][y] = 1;
        
        while (!q.isEmpty()) {
            int[] current = q.poll();
            int cx = current[0];
            int cy = current[1];
            
            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];
                if (nx >= 0 && nx < N && ny >= 0 && ny < M) {
                    if (map[nx][ny] == 1 && distance[nx][ny] == 0) {
                        q.offer(new int[]{nx, ny});
                        distance[nx][ny] = distance[cx][cy] + 1;
                    }
                }
            }
        }
        
    }
}