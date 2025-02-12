import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int amount = Integer.parseInt(br.readLine());
        int answer = 0;

        while (amount >= 0) {
            if (amount % 5 == 0) {
                answer += amount / 5;
                System.out.println(answer);
                return;    
            }
            amount -= 3;
            answer++;
        }
        System.out.println(-1);
    }
}
