class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] cnt = new int[200];
        
        for (int[] line : lines) {
            int start = line[0] + 100;
            int end = line[1] + 100;
            
            for (int i = start; i < end; i++) {
                cnt[i]++;
            }
        }
        
        for (int count : cnt) {
            if (count > 1) {
                answer++;
            }
        }
        
        return answer;
    }
}