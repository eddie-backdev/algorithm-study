import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int answer = 0;
        int[] cow = new int[10];

        for (int i = 0; i < 10; i++) {
            cow[i] = -1;
        }

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String cowStr = br.readLine();
            StringTokenizer st = new StringTokenizer(cowStr);

            int cowNumber = Integer.parseInt(st.nextToken());
            int cowLR = Integer.parseInt(st.nextToken());

            if (cow[cowNumber - 1] != -1 && cow[cowNumber - 1] != cowLR) {
                answer++;
                cow[cowNumber - 1] = cowLR;
            } else {
                cow[cowNumber - 1] = cowLR;
            }
        }

        System.out.println(answer);
    }

}
