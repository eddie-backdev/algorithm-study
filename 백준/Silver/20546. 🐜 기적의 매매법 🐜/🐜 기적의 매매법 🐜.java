import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int budget = Integer.parseInt(br.readLine());

        int jCnt = 0, sCnt = 0;
        int jBudget = budget, sBudget = budget;

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] stock = new int[14];

        for (int i = 0; i < 14; i++) {
            stock[i] = Integer.parseInt(st.nextToken());
        }

        // 준현
        for (int price : stock) {
            int tCnt = jBudget / price;
            if (tCnt > 0) {
                jCnt += tCnt;
                jBudget %= price;
            }
        }

        // 성민
        int up = 0, down = 0;
        for (int i = 1; i < 14; i++) {
            if (stock[i] > stock[i - 1]) {
                up++;
                down = 0;
            } else if (stock[i] < stock[i - 1]) {
                down++;
                up = 0;
            } else {
                up = 0;
                down = 0;
            }

            if (up >= 3) {
                if (sCnt > 0) {
                    sBudget += sCnt * stock[i];
                    sCnt = 0;
                }
            }

            if (down >= 3) {
                int tCnt = sBudget / stock[i];
                if (tCnt > 0) {
                    sCnt += tCnt;
                    sBudget %= stock[i];
                }
            }
        }

        jBudget += jCnt * stock[13];
        sBudget += sCnt * stock[13];

        if (jBudget > sBudget) {
            System.out.println("BNP");
        } else if (jBudget < sBudget) {
            System.out.println("TIMING");
        } else {
            System.out.println("SAMESAME");
        }
    }
}
