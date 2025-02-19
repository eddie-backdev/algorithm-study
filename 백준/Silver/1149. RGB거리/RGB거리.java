import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] memoi = new int[N][3];
        int[][] cost = new int[N][3];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            cost[i][0] = Integer.parseInt(st.nextToken());
            cost[i][1] = Integer.parseInt(st.nextToken());
            cost[i][2] = Integer.parseInt(st.nextToken());
        }

        memoi[0][0] = cost[0][0];
        memoi[0][1] = cost[0][1];
        memoi[0][2] = cost[0][2];

        for (int i = 1; i < N; i++) {
            memoi[i][0] = Math.min(memoi[i - 1][1], memoi[i - 1][2]) + cost[i][0];
            memoi[i][1] = Math.min(memoi[i - 1][0], memoi[i - 1][2]) + cost[i][1];
            memoi[i][2] = Math.min(memoi[i - 1][0], memoi[i - 1][1]) + cost[i][2];
        }

        int min = Math.min(memoi[N - 1][0], Math.min(memoi[N - 1][1], memoi[N - 1][2]));
        System.out.println(min);
    }
}
