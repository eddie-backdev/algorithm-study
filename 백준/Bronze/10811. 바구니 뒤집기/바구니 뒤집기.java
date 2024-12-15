import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int start = 0;
        int end = 0;
        int temp = 0;
        int[] bucket = new int[N];
        for (int i = 0; i < N; i++) {
            bucket[i] = i + 1;
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            start = Integer.parseInt(st.nextToken()) - 1;
            end = Integer.parseInt(st.nextToken()) - 1;
            for (int j = start; j < end; j++) {
                temp = bucket[j];
                bucket[j] = bucket[end];
                bucket[end] = temp;
                end--;
            }
        }
        for (int i : bucket) {
            System.out.print(i + " ");
        }
        br.close();
    }
}
