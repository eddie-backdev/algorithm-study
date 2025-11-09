import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine().trim());

        for (int tc = 1; tc <= T; tc++) {
            String input = br.readLine();

            for (int j = 1; j <= input.length(); j++) {
                String a = input.substring(0, j);
                String b = input.substring(j, j * 2);

                if (a.equals(b)) {
                    sb.append('#').append(tc).append(' ').append(j).append('\n');
                    break;
                }
            }
        }
        System.out.print(sb);
    }
}
