import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());

        int l = 0;
        int r = 0;
        int length = Integer.MAX_VALUE;
        int sum = 0;

        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        while (true) {
            if (sum >= S) {
                length = Math.min(length, r - l);
                sum -= arr[l++];
            } else if (r == N) {
                break;
            } else {
                sum += arr[r++];
            }
        }

        if (length == Integer.MAX_VALUE) {
            System.out.println(0);
        } else {
            System.out.println(length);
        }
    }
}
