import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static boolean[] visited;
    static int[][] graph;
    static int count;
    static int vertex;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        vertex = Integer.parseInt(br.readLine());
        int linked = Integer.parseInt(br.readLine());
        visited = new boolean[vertex + 1];
        graph = new int[vertex + 1][vertex + 1];

        for (int i = 0; i < linked; i++) {
            st = new StringTokenizer(br.readLine());
            int left = Integer.parseInt(st.nextToken());
            int right = Integer.parseInt(st.nextToken());
            graph[left][right] = graph[right][left] = 1;
        }
        dfs(1);
        System.out.println(count);
    }

    public static void dfs(int v) {
        visited[v] = true;
        for (int i = 0; i <= vertex; i++) {
            if (graph[v][i] == 1 && !visited[i]) {
                count++;
                dfs(i);
            }
        }
    }
}
