import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] grade = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0"};
        int TC = Integer.parseInt(br.readLine().trim());

        for (int t = 1; t <= TC; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine().trim());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            Double[] score = new Double[N];

            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine().trim());

                double mid = Double.parseDouble(st.nextToken());
                double fin = Double.parseDouble(st.nextToken());
                double report = Double.parseDouble(st.nextToken());

                double sum = mid * 0.35 + fin * 0.45 + report * 0.2;
                score[i] = sum;
            }

            double target = score[K - 1];
            Arrays.sort(score, Collections.reverseOrder());
            int targetIndex = 0;
            for (int i = 0; i < N; i++) {
                if (target == score[i]) {
                    targetIndex = i;
                }
            }
            int gradeStandard = N / 10;
            sb.append('#').append(t).append(' ').append(grade[targetIndex / gradeStandard]).append('\n');
        }
        System.out.println(sb);
    }
}
