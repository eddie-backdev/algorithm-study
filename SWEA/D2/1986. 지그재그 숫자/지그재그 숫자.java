import java.io.BufferedReader;
import java.io.InputStreamReader;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int TC = Integer.parseInt(br.readLine().trim());

        for (int t = 1; t <= TC; t++) {
            int N = Integer.parseInt(br.readLine().trim());
            int answer = 0;
            for (int i = 1; i <= N; i++) {
                if (i % 2 == 0) {
                    answer -= i;
                } else {
                    answer += i;
                }
            }
            sb.append('#').append(t).append(' ').append(answer).append('\n');
        }
        System.out.println(sb);
    }
}
