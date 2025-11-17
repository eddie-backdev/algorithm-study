import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int TC = Integer.parseInt(br.readLine().trim());

        for (int t = 1; t <= TC; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine().trim());
            int sum = 0;
            int min = 10000;
            int max = 0;

            for (int i = 0; i < 10; i++) {
                int n = Integer.parseInt(st.nextToken());
                sum += n;
                min = Math.min(min, n);
                max = Math.max(max, n);
            }
            double avg = (sum - min - max) / 8.0;
            int answer = (int) Math.round(avg);
            sb.append('#').append(t).append(' ').append(answer).append('\n');
        }
        
        System.out.println(sb);
    }
}