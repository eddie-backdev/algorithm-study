import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        Deque<Integer> dq = new ArrayDeque<>();
        
        for (int i = 0; i < progresses.length; i++) {
            int work = 100 - progresses[i];
            
            int deploy = work % speeds[i] == 0 ? work / speeds[i] : work / speeds[i] + 1;
            
            dq.add(deploy);
        }
        
        while (!dq.isEmpty()) {
            int currentDeploy = dq.poll();
            int count = 1;
            
            while (!dq.isEmpty() && currentDeploy >= dq.peek()) {
                count++;
                dq.poll();
            }
            
            answer.add(count);
        }
        
        return answer.stream().mapToInt(i -> i).toArray();
    }
}