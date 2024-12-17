import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] s = new String[N];
        for (int i = 0; i < N; i++) {
            s[i] = br.readLine().replaceAll(" ", "");
        }

        for (String input : s) {
            int max = 0;
            char answer = '?';
            int[] count = new int[26];
            char[] charArray = input.toCharArray();
            for (char c : charArray) {
                count[c - 97]++;
            }
            for (int i = 0; i < 26; i++) {
                if (max < count[i]) {
                    max = count[i];
                    answer = (char) (i + 97);
                } else if (max == count[i]) {
                    answer = '?';
                }
            }
            System.out.println(answer);
        }
    }
}