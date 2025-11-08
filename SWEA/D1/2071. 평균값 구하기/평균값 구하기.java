import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine().trim());

        for (int tc = 1; tc <= T; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int sum = 0;

            for (int i = 0; i < 10; i++) {
                sum += Integer.parseInt(st.nextToken());
            }

            long avg = Math.round(sum / 10.0);

            sb.append('#').append(tc).append(' ').append(avg).append('\n');
        }

        System.out.print(sb);
    }
}
