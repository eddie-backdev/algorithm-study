import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());

            sb.append(getIntersectionCount(x1, y1, r1, x2, y2, r2)).append("\n");
        }
        System.out.print(sb);
    }

    static int getIntersectionCount(int x1, int y1, int r1, int x2, int y2, int r2) {
        int distancePow = (int)(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        int rSumPow = (int)Math.pow(r1 + r2, 2);
        int rDiffPow = (int)Math.pow(r1 - r2, 2);

        if (x1 == x2 && y1 == y2 && r1 == r2) {
            return -1;
        } else if (distancePow > rSumPow || distancePow < rDiffPow) {
            return 0;
        } else if (distancePow == rSumPow || distancePow == rDiffPow) {
            return 1;
        } else {
            return 2;
        }
    }
}
