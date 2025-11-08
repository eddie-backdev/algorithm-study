import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            String num = String.valueOf(i);
            int cnt = 0;

            for (int j = 0; j < num.length(); j++) {
                char c = num.charAt(j);
                if (c == '3' || c == '6' || c == '9') {
                    cnt++;
                }
            }

            if (cnt != 0) {
                for (int j = 0; j < cnt; j++) {
                    sb.append('-');
                }
            } else {
                sb.append(i);
            }
            sb.append(' ');
        }
        System.out.print(sb);
    }
}
