import java.util.PriorityQueue;

class Solution {
        public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
            
        int answer = 0;
            
        for (int i : scoville) {
            pq.add(i);
        }

        while (pq.peek() < K) {
            if (pq.size() < 2) {
                return -1;
            }

            int first = pq.poll();
            int second = pq.poll();

            int mix = first + second * 2;
            pq.add(mix);
            answer++;
        }

        return answer;
    }
}