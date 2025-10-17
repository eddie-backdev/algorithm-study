import java.util.*;

class Solution {
    private int[] numbers;
    private int target;
    private int answer;

    public int solution(int[] numbers, int target) {
        this.numbers = numbers;
        this.target = target;
        this.answer = 0;
        // dfs(0, 0);
        bfs();
        return answer;
    }
    
    // bfs로도 풀어보기
    private void bfs() {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0, 0});
        int length = numbers.length;
        
        while(!q.isEmpty()) {
            int[] now = q.poll();
            int sum = now[0];
            int idx = now[1];
            
            if (idx == length) {
                if (sum == target) {
                    answer++;
                }
                continue;
            }
            
            q.offer(new int[]{sum + numbers[idx], idx + 1});
            q.offer(new int[]{sum - numbers[idx], idx + 1});
        }
    }

    private void dfs(int sum, int idx) {
        if (idx == numbers.length) {
            if (sum == target) answer++;
            return;
        }
        dfs(sum + numbers[idx], idx + 1);
        dfs(sum - numbers[idx], idx + 1);
    }
}
