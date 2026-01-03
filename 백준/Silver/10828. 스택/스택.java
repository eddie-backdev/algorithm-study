import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        Deque<Integer> dq = new ArrayDeque<>();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String operation = st.nextToken();

            if (operation.equals("push")) {
                dq.push(Integer.parseInt(st.nextToken()));
                continue;
            }

            switch (operation) {
                case "pop":
                    if (dq.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(dq.pop()).append("\n");
                    }
                    break;

                case "size":
                    sb.append(dq.size()).append("\n");
                    break;

                case "empty":
                    if (dq.isEmpty()) {
                        sb.append(1).append("\n");
                    } else {
                        sb.append(0).append("\n");
                    }
                    break;

                case "top":
                    if (dq.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(dq.peek()).append("\n");
                    }
                    break;
            }
        }

        System.out.println(sb);
    }
}
