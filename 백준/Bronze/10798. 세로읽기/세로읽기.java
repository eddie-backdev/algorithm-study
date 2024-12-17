import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = new String[5];
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            input[i] = br.readLine();
            int length = input[i].length();
            for (int j = 0; j < 15 - length; j++) {
                input[i] = input[i] + " ";
            }
        }

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (input[j].charAt(i) == ' ') {
                    continue;
                }
                answer.append(input[j].charAt(i));
            }
        }
        System.out.println(answer);
    }
}