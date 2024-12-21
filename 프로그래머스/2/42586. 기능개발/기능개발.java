import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> q = new LinkedList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        
        for (int i = 0; i < progresses.length; i++) {
            int remain = 100 - progresses[i];
            if (remain % speeds[i] == 0) {
                q.offer(remain / speeds[i]);
            } else {
                q.offer(remain / speeds[i] + 1);
            }
        }
        
        int count = 0;
        int day = q.peek();
        
        while (!q.isEmpty()) {
            if (day >= q.peek()) {
                q.poll();
                count++;
            } else {
                ans.add(count);;
                count = 1;
                day = q.poll();
            }
        }
        ans.add(count);
        
        return ans.stream()
            .mapToInt(Integer::intValue)
            .toArray();
    }
}