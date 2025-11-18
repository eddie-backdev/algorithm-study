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
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());

            if (A % 2 == 0 || B % 2 == 0 || C % 2 == 0) {
                sb.append("1\n");
            } else {
                sb.append("2\n");
            }
        }
        System.out.println(sb);
    }
}
