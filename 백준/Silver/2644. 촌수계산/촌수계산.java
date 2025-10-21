import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    static int n, m, start, end;
    static int[][] graph;
    static int[] dist;

    public static void bfs(int index) {
        Deque<Integer> dq = new ArrayDeque<>();
        dq.add(index);

        while (!dq.isEmpty()) {
            int temp = dq.poll();

            if (temp == end) {
                break;
            }

            for (int i = 1; i <= n; i++) {
                if (graph[temp][i] == 1 && dist[i] == 0) {
                    dq.add(i);
                    dist[i] = dist[temp] + 1;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        graph = new int[n + 1][n + 1];
        dist = new int[n + 1];

        StringTokenizer st = new StringTokenizer(br.readLine());

        start = Integer.parseInt(st.nextToken());
        end = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(br.readLine());

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph[x][y] = graph[y][x] = 1;
        }

        bfs(start);

        System.out.println(dist[end] == 0 ? -1 : dist[end]);
    }
}
