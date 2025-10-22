import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    static int n, m;
    static int[][] graph;
    static int[][] visited;

    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {-1, 0, 1, 0};

    public static void bfs() {
        Deque<int[]> dq = new ArrayDeque<>();
        dq.offer(new int[]{0, 0});
        visited[0][0] = 1;

        while (!dq.isEmpty()) {
            int[] cur = dq.poll();
            for (int i = 0; i < 4; i++) {
                int x = cur[0];
                int y = cur[1];

                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || ny < 0 || nx >= n || ny >= m) {
                    continue;
                }

                if (graph[nx][ny] == 0 || visited[nx][ny] != 0) {
                    continue;
                }

                visited[nx][ny] = visited[x][y] + 1;
                dq.offer(new int[]{nx, ny});
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        graph = new int[n][m];
        visited = new int[n][m];

        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            for (int j = 0; j < m; j++) {
                graph[i][j] = input.charAt(j) - '0';
            }
        }

        bfs();

        System.out.println(visited[n - 1][m - 1]);
    }
}
