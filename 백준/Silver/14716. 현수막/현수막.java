import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int M, N;
    static int[][] grid;
    static int[] dr = {-1, -1, -1, 0, 0, 1, 1, 1};
    static int[] dc = {-1, 0, 1, -1, 1, -1, 0, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        grid = new int[M][N];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                grid[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int count = 0;

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (grid[i][j] == 1) {
                    count++;
                    Queue<int[]> q = new ArrayDeque<>();
                    
                    q.offer(new int[]{i, j});
                    grid[i][j] = 0;

                    while (!q.isEmpty()) {
                        int[] current = q.poll();
                        
                        int r = current[0];
                        int c = current[1];

                        for (int k = 0; k < 8; k++) {
                            int nr = r + dr[k];
                            int nc = c + dc[k];

                            if (nr >= 0 && nr < M && nc >= 0 && nc < N) {
                                if (grid[nr][nc] == 1) {
                                    q.offer(new int[]{nr, nc});
                                    grid[nr][nc] = 0;
                                }
                            }
                        }
                    }
                }
            }
        }

        System.out.println(count);
    }
}
