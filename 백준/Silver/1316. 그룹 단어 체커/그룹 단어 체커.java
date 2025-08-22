import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < N; i++) {
            String input = br.readLine();

            if (checker(input)) {
                count++;
            }

        }
        System.out.println(count);
    }

    static boolean checker(String input) {
        boolean[] visited = new boolean[26];
        int prev = 0;

        for (int i = 0; i < input.length(); i++) {
            int now = input.charAt(i);

            if (prev != now) {
                if (!visited[now - 'a']) {
                    visited[now - 'a'] = true;
                    prev = now;
                } else {
                    return false;
                }
            }

        }

        return true;
    }
}
