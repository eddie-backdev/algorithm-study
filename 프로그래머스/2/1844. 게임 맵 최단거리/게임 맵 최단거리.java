import java.util.*;

class Solution {
    
    int[] dx = {0, 0, -1, 1};
    int[] dy = {-1, 1, 0, 0};
    boolean[][] visited;
    int[][] score;

    public int solution(int[][] maps) {
        visited = new boolean[maps.length][maps[0].length];
        score = new int[maps.length][maps[0].length];
        score[0][0] = 1;
        bfs(maps);
        if (score[maps.length - 1][maps[0].length - 1] == 0) {
            return -1;
        } else {
            return score[maps.length - 1][maps[0].length - 1];
        }
    }

    void bfs(int[][] maps) {
        Queue<int[]> q = new ArrayDeque<>();
        q.offer(new int[]{0, 0});
        visited[0][0] = true;

        while (!q.isEmpty()) {
            int[] current = q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = current[0] + dx[i];
                int ny = current[1] + dy[i];

                if (nx >= 0 && nx < maps.length && ny >= 0 && ny < maps[0].length) {
                    if (!visited[nx][ny] && maps[nx][ny] == 1) {
                        visited[nx][ny] = true;
                        score[nx][ny] = score[current[0]][current[1]] + 1;
                        q.offer(new int[]{nx, ny});
                    }
                }
            }

        }
    }
    
}