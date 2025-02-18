import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static int rcX, rcY, d;
    static int[][] room;
    static boolean[][] cleaned;
    static int cnt = 0;

    // 북, 동, 남, 서
    static int[] dx = {-1, 0, 1, 0};  // 행 이동
    static int[] dy = {0, 1, 0, -1};  // 열 이동

    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        room = new int[N][M];
        cleaned = new boolean[N][M];

        st = new StringTokenizer(br.readLine());
        rcX = Integer.parseInt(st.nextToken());
        rcY = Integer.parseInt(st.nextToken());
        d = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                room[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 풀이
        clean();
        System.out.println(cnt);
    }

    static void clean() {
        while (true) {
            // 청소되지 않았다면 해당 위치를 청소하고 카운트를 하나 증가시킨다.
            if (!cleaned[rcX][rcY]) {
                cleaned[rcX][rcY] = true;
                cnt++;
            }

            boolean moved = false;
            // 로청을 반시계로 돌리면서 청소되지 않은 공간이 있는지 확인
            for (int i = 0; i < 4; i++) {
                // 반시계 방향으로 회전
                d = (d + 3) % 4;
                int nr = rcX + dx[d];
                int nc = rcY + dy[d];

                // 벽인지 아닌지 확인
                if (nr >= 0 && nr < N && nc >= 0 && nc < M) {
                    // 청소할 공간이 있다면 이동 후 청소
                    if (room[nr][nc] == 0 && !cleaned[nr][nc]) {
                        rcX = nr;
                        rcY = nc;
                        moved = true;
                        break;
                    }
                }
            }

            if (!moved) {
                int backD = (d + 2) % 4;
                int bX = rcX + dx[backD];
                int bY = rcY + dy[backD];

                if (bX >= 0 && bX < N && bY >= 0 && bY < M && room[bX][bY] == 0) {
                    rcX = bX;
                    rcY = bY;
                } else {
                    break;  // 후진도 못 하면 종료
                }
            }
        }
    }
}
