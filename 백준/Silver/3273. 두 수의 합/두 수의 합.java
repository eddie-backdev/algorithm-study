import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = 0;
        int N = Integer.parseInt(br.readLine());
        int l = 0;
        int r = N - 1;
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        int target = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        while (l < r) {
            int sum = arr[l] + arr[r];

            if (sum == target) {
                answer++;
                l++;
                r--;
            } else if (sum < target) {
                l++;
            } else {
                r--;
            }
        }

        System.out.println(answer);
    }
}
