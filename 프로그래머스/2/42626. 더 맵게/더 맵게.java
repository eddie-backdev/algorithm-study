import java.util.PriorityQueue;

class Solution {
        public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
            
        int cnt = 0;
            
        for (int i : scoville) {
            pq.offer(i);
        }

        while (pq.peek() < K) {
            int first = pq.poll();
            int second = 0;
            int sum = 0;
            if (!pq.isEmpty()) {
                second = pq.poll();
                sum = first + (second * 2);
                pq.offer(sum);
                cnt++;
            } else {
                return -1;
            }
        }
        return cnt;
    }
}