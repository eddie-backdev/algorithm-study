import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int[] belt = new int[N];
        for (int i = 0; i < N; i++) {
            belt[i] = Integer.parseInt(br.readLine());
        }

        int[] visited = new int[d + 1];
        int count = 0;

        visited[c]++;
        count++;

        for (int i = 0; i < k; i++) {
            if (visited[belt[i]] == 0) {
                count++;
            }
            visited[belt[i]]++;
        }

        int maxCount = count;

        for (int i = 0; i < N - 1; i++) {
            int removeDish = belt[i];
            visited[removeDish]--;
            if (visited[removeDish] == 0) {
                count--;
            }

            int addDish = belt[(i + k) % N];
            if (visited[addDish] == 0) {
                count++;
            }
            visited[addDish]++;

            if (maxCount < count) {
                maxCount = count;
            }
        }

        System.out.println(maxCount);
    }
}
