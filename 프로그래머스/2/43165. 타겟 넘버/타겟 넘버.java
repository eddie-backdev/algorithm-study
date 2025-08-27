class Solution {
    private int[] numbers;
    private int target;
    private int answer;

    public int solution(int[] numbers, int target) {
        this.numbers = numbers;
        this.target = target;
        this.answer = 0;
        dfs(0, 0);
        return answer;
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
