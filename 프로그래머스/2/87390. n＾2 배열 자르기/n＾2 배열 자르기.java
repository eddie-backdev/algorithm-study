class Solution {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int)(right - left + 1)];
        
        for (int i = 0; i < answer.length; i++) {
            int n1 = (int)(left % n + 1);
            int n2 = (int)(left / n + 1);
            left++;
            answer[i] = Math.max(n1, n2);
        }
        
        return answer;
    }
}