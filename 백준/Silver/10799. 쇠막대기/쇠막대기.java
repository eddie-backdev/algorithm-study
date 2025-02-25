import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

    public static void main(String[] args) throws IOException {
        Deque<Character> stack = new ArrayDeque<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = 0;
        String input = br.readLine();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(') {
                stack.push(input.charAt(i));
                continue;
            }
            stack.pop();
            if (input.charAt(i - 1) == '(') {
                answer += stack.size();
            } else {
                answer++;
            }
        }
        System.out.println(answer);
    }
}
