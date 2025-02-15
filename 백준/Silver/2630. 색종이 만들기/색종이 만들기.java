import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] board;
    static int white;
    static int blue;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        board = new int[N][N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        divide(0, 0, N);

        System.out.println(white);
        System.out.println(blue);
    }

    static void divide(int x, int y, int size) {
        if (checkColor(x, y, size)) {
            if (board[x][y] == 0) {
                white++;
            } else {
                blue++;
            }
            return;
        }

        int divideSize = size / 2;
        divide(x, y, divideSize);
        divide(x, y + divideSize, divideSize);
        divide(x + divideSize, y, divideSize);
        divide(x + divideSize, y + divideSize, divideSize);
    }

    static boolean checkColor(int x, int y, int size) {
        int color = board[x][y];

        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (board[i][j] != color) {
                    return false;
                }
            }
        }
        
        return true;
    }
}
