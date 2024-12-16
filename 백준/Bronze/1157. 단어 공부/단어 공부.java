import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int max = 0;
        char answer = '?';
        char[] charArray = s.toUpperCase().toCharArray();
        int[] count = new int[26];
        for (char c : charArray) {
            count[c - 65]++;
        }
        for (int i = 0; i < 26; i++) {
            if (max < count[i]) {
                max = count[i];
                answer = (char) (i + 65);
            } else if (max == count[i]) {
                answer = '?';
            }
        }
        System.out.println(answer);
    }
}
