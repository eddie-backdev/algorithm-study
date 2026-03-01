import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int n, m;
    static int[][] grid;
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        grid = new int[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                grid[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int count = 0;
        int maxArea = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    count++;
                    int currentArea = 0;
                    Queue<int[]> q = new ArrayDeque<>();
                    
                    q.offer(new int[]{i, j});
                    grid[i][j] = 0;

                    while (!q.isEmpty()) {
                        int[] current = q.poll();
                        currentArea++;
                        
                        int r = current[0];
                        int c = current[1];

                        for (int k = 0; k < 4; k++) {
                            int nr = r + dr[k];
                            int nc = c + dc[k];

                            if (nr >= 0 && nr < n && nc >= 0 && nc < m) {
                                if (grid[nr][nc] == 1) {
                                    q.offer(new int[]{nr, nc});
                                    grid[nr][nc] = 0;
                                }
                            }
                        }
                    }
                    
                    if (currentArea > maxArea) {
                        maxArea = currentArea;
                    }
                }
            }
        }

        System.out.println(count);
        System.out.println(maxArea);
    }
}
