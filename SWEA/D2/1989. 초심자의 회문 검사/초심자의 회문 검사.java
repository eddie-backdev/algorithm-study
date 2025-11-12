import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine().trim());

        for (int tc = 1; tc <= T; tc++) {
            String input = br.readLine().trim();
            for (int i = 0; i < input.length(); i++) {
                if (i < input.length() / 2) {
                    if (input.charAt(i) != input.charAt(input.length() - i - 1)) {
                        sb.append('#').append(tc).append(' ').append('0').append('\n');
                        break;
                    }
                }
                if (i == input.length() / 2) {
                    sb.append('#').append(tc).append(' ').append('1').append('\n');
                }
            }
        }
        System.out.print(sb);
    }
}
