import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[] arr;
    static boolean[] visited;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int tCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < tCase; i++) {
            StringTokenizer st;
            int n = Integer.parseInt(br.readLine());
            arr = new int[n + 1];
            int cycle = 0;

            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }

            visited = new boolean[n + 1];

            for (int j = 1; j <= n; j++) {
                if (!visited[j]) {
                    dfs(j);
                    cycle++;
                }
            }

            sb.append(cycle + "\n");
        }
        System.out.print(sb);
    }

    static void dfs(int idx) {
        visited[idx] = true;
        if (!visited[arr[idx]]) {
            dfs(arr[idx]);
        }
    }

}
