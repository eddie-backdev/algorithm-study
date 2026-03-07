import java.util.*;

class Solution {
    public int solution(int[][] jobs) {
        int answer = 0;
        int count = 0;
        int jobsIdx = 0;
        int lastTime = 0;
        
        Arrays.sort(jobs, (o1, o2) -> o1[0] - o2[0]);
        PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]);

        while (count < jobs.length) {
            while (jobsIdx < jobs.length && jobs[jobsIdx][0] <= lastTime) {
                pq.add(jobs[jobsIdx++]);
            }

            if (pq.isEmpty()) {
                lastTime = jobs[jobsIdx][0];
            } else {
                int[] temp = pq.poll();
                answer += (lastTime - temp[0]) + temp[1];
                lastTime += temp[1];
                count++;
            }
        }

        return (int) (answer / jobs.length);
    }
}