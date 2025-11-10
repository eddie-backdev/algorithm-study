import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine().trim());

        for (int tc = 1; tc <= T; tc++) {
            int N = Integer.parseInt(br.readLine());
            int[][] graph = new int[N][];
            for (int i = 0; i < N; i++) {
                graph[i] = new int[i + 1];
                graph[i][0] = 1;
                graph[i][i] = 1;

                for (int j = 1; j < i; j++) {
                    graph[i][j] = graph[i - 1][j - 1] + graph[i - 1][j];
                }
            }

            sb.append('#').append(tc).append('\n');
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < graph[i].length; j++) {
                    sb.append(graph[i][j]).append(' ');
                }
                sb.append('\n');
            }
        }
        System.out.print(sb);
    }
}