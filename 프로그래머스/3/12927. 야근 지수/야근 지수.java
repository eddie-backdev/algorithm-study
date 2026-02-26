import java.util.*;

class Solution {
    public long solution(int n, int[] works) {
        long answer = 0;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for (int w : works) {
            pq.add(w);
        }
        
        for (int i = 0; i < n; i++) {
            int w = pq.poll();
            
            if (w == 0) {
                return 0;
            }
            
            pq.add(w - 1);
        }
        
        while (!pq.isEmpty()) {
            int w = pq.poll();
            
            answer += w * w;
        }
        
        return answer;
    }
}