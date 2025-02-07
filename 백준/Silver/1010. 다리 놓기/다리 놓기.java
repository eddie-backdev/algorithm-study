import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static BigInteger combination(int m, int n) {
        BigInteger result = BigInteger.ONE;

        for (int i = 0; i < n; i++) {
            result = result.multiply(BigInteger.valueOf(m - i));
            result = result.divide(BigInteger.valueOf(i + 1));
        }

        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            sb.append(combination(m, n)).append("\n");
        }
        System.out.println(sb);
    }
}
