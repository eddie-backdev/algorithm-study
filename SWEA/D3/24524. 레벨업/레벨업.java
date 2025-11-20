import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int TC = Integer.parseInt(br.readLine().trim());

        for (int t = 1; t <= TC; t++) {
            int N = Integer.parseInt(br.readLine().trim());
            int[] X = new int[N];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                X[i] = Integer.parseInt(st.nextToken());
            }

            int base = 0;
            for (int i = 0; i < N - 1; i++) {
                base += Math.abs(X[i + 1] - X[i]);
            }

            int answer = Integer.MAX_VALUE;

            for (int i = 1; i <= N - 2; i++) {
                int remove = Math.abs(X[i] - X[i - 1]) + Math.abs(X[i + 1] - X[i]);
                int add = Math.abs(X[i + 1] - X[i - 1]);
                int dist = base - remove + add;
                if (dist < answer) {
                    answer = dist;
                }
            }
            sb.append(answer).append('\n');
        }
        System.out.println(sb);
    }
}
