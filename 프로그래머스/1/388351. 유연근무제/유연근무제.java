class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int n = schedules.length;
        int cnt = 0;

        int sat = (6 - startday + 7) % 7;
        int sun = (7 - startday + 7) % 7;

        for (int i = 0; i < n; i++) {
            int t = schedules[i] / 100;
            int m = schedules[i] % 100;
            m += 10;
            if (m >= 60) {
                t++;
                m -= 60;
            }
            int sch = t * 100 + m;

            boolean isLate = false;
            for (int j = 0; j < 7; j++) {
                if (j == sat || j == sun) {
                    continue;
                }

                if (sch < timelogs[i][j]) {
                    isLate = true;
                    break;
                }
            }

            if (!isLate) {
                cnt++;
            }
        }

        return cnt;
    }
}
