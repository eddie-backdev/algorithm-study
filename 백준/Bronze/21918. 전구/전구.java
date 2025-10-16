import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int[] status = new int[N];
        int[][] command = new int[M][3];
        for (int i = 0; i < N; i++) {
            status[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            command[i][0] = Integer.parseInt(st.nextToken());
            command[i][1] = Integer.parseInt(st.nextToken());
            command[i][2] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < M; i++) {
            int cmd = command[i][0];

            if (cmd == 1) {
                int a = command[i][1] - 1;
                int b = command[i][2];
                status[a] = b;

            } else {
                int L = command[i][1] - 1;
                int R = command[i][2] - 1;

                switch (cmd) {
                    case 2:
                        for (int j = L; j <= R; j++) {
                            status[j] = (status[j] == 1 ? 0 : 1);
                        }
                        break;

                    case 3:
                        for (int j = L; j <= R; j++) {
                            status[j] = 0;
                        }
                        break;

                    case 4:
                        for (int j = L; j <= R; j++) {
                            status[j] = 1;
                        }
                        break;
                }
            }
        }

        for (int s : status) {
            sb.append(s);
            sb.append(" ");
        }

        System.out.print(sb);
    }
}
