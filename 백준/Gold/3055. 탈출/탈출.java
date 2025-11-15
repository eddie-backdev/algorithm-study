import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static Character[][] map;
    static boolean[][] visited;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, -1, 0, 1};

    static Queue<int[]> dochi = new ArrayDeque<>();
    static Queue<int[]> water = new ArrayDeque<>();

    static int R;
    static int C;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        map = new Character[R][C];
        visited = new boolean[R][C];

        for (int i = 0; i < R; i++) {
            String input = br.readLine();
            for (int j = 0; j < C; j++) {
                map[i][j] = input.charAt(j);
                if (input.charAt(j) == 'S') {
                    dochi.offer(new int[]{i, j, 0});
                    visited[i][j] = true;
                } else if (input.charAt(j) == '*') {
                    water.offer(new int[]{i, j});
                }
            }
        }
        System.out.println(bfs());
    }

    static String bfs() {

        while (!dochi.isEmpty()) {
            int length = water.size();
            for (int i = 0; i < length; i++) {
                int[] wq = water.poll();
                int x = wq[0];
                int y = wq[1];

                for (int j = 0; j < 4; j++) {
                    int nx = x + dx[j];
                    int ny = y + dy[j];

                    if (nx < 0 || ny < 0 || nx >= R || ny >= C) {
                        continue;
                    }

                    if (map[nx][ny] == '.' || map[nx][ny] == 'S') {
                        map[nx][ny] = '*';
                        water.offer(new int[]{nx, ny});
                    }
                }
            }

            length = dochi.size();
            for (int i = 0; i < length; i++) {
                int[] dq = dochi.poll();
                int x = dq[0];
                int y = dq[1];
                int cnt = dq[2];

                for (int j = 0; j < 4; j++) {
                    int nx = x + dx[j];
                    int ny = y + dy[j];

                    if (nx < 0 || ny < 0 || nx >= R || ny >= C) {
                        continue;
                    }
                    if (map[nx][ny] == 'X' || map[nx][ny] == '*') {
                        continue;
                    }

                    if (map[nx][ny] == 'D') {
                        return String.valueOf(cnt + 1);
                    }

                    if (map[nx][ny] == '.' && !visited[nx][ny]) {
                        visited[nx][ny] = true;
                        dochi.offer(new int[]{nx, ny, cnt + 1});
                    }
                }
            }
        }

        return "KAKTUS";
    }

}
