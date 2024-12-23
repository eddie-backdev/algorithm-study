import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.Collections;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for (int a : priorities) {
            pq.add(a);
        }
        
        while (!pq.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if (priorities[i] == pq.peek()) {
                    answer++;
                    pq.poll();
                    if (i == location) {
                        return answer;
                    }
                }
            }
        }
        return answer;
    }
}