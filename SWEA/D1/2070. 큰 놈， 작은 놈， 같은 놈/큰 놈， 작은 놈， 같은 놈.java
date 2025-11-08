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
            
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (a < b) {
                sb.append('#').append(tc).append(" <").append('\n');
            } else if (a == b) {
                sb.append('#').append(tc).append(" =").append('\n');
            } else {
                sb.append('#').append(tc).append(" >").append('\n');
            }
        }

        System.out.print(sb);
    }
}