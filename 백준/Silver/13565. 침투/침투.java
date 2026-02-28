import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int M, N;
    static int[][] grid;
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        grid = new int[M][N];
        Queue<int[]> q = new ArrayDeque<>();

        for (int i = 0; i < M; i++) {
            String line = br.readLine();
            for (int j = 0; j < N; j++) {
                grid[i][j] = line.charAt(j) - '0';
                
                if (i == 0 && grid[i][j] == 0) {
                    q.offer(new int[]{i, j});
                    grid[i][j] = 2;
                }
            }
        }

        boolean percolates = false;

        while (!q.isEmpty()) {
            int[] current = q.poll();
            int r = current[0];
            int c = current[1];

            if (r == M - 1) {
                percolates = true;
                break;
            }

            for (int i = 0; i < 4; i++) {
                int nr = r + dr[i];
                int nc = c + dc[i];

                if (nr >= 0 && nr < M && nc >= 0 && nc < N) {
                    if (grid[nr][nc] == 0) {
                        q.offer(new int[]{nr, nc});
                        grid[nr][nc] = 2;
                    }
                }
            }
        }

        if (percolates) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
