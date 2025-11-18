import java.io.BufferedReader;
import java.io.InputStreamReader;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int TC = Integer.parseInt(br.readLine().trim());

        for (int t = 1; t <= TC; t++) {
            String input = br.readLine().trim();
            int[] position = new int[10];
            int[] cnt = new int[10];
            boolean isOk = true;

            for (int i = 0; i < input.length(); i++) {
                int n = input.charAt(i) - '0';

                if (cnt[n] == 0) {
                    position[n] = i;
                    cnt[n] = 1;
                } else if (cnt[n] == 1) {
                    int between = i - position[n] - 1;

                    if (between != n) {
                        isOk = false;
                        break;
                    }

                    cnt[n] = 2;
                } else {
                    isOk = false;
                    break;
                }
            }

            if (isOk) {
                for (int i = 0; i < 10; i++) {
                    if (cnt[i] == 1) {
                        isOk = false;
                        break;
                    }
                }
            }

            sb.append(isOk ? "yes\n" : "no\n");
        }
        System.out.println(sb);
    }
}
