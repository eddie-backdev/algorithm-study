class Solution {
    int[] numbers;
    int answer;
    
    public int solution(int[] numbers, int target) {
        this.numbers = numbers;
        dfs(target, 0, 0);
        return answer;
    }
    
    void dfs(int target, int current, int idx) {
        if (idx == numbers.length) {
            if (target == current) {
                answer++;
            }
            return;
        }
        
        int p = current + numbers[idx];
        int m = current - numbers[idx];
        
        dfs(target, p, idx + 1);
        dfs(target, m, idx + 1);
    }
}