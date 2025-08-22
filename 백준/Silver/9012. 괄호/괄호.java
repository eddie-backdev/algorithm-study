import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] answer = new String[N];
        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            int count = 0;

            if (input.startsWith(")")) {
                answer[i] = "NO";
                continue;
            }

            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(j) == '(') {
                    count++;
                } else {
                    count--;
                }
                if (count < 0) {
                    answer[i] = "NO";
                    break;
                }
            }

            if (count == 0) {
                answer[i] = "YES";
            } else {
                answer[i] = "NO";
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.println(answer[i]);
        }
    }
}
