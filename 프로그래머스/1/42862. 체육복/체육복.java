class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] clothes = new int[n + 2];
        
        for (int r : reserve) {
            clothes[r]++;
        }
        
        for (int l : lost) {
            clothes[l]--;
        }
        
        int answer = 0;
        
        for (int i = 1; i <= n; i++) {
            if (clothes[i] == -1) {
                if (clothes[i - 1] == 1) {
                    clothes[i - 1]--;
                    clothes[i]++;
                } else if (clothes[i + 1] == 1) {
                    clothes[i + 1]--;
                    clothes[i]++;
                }
            }
            
            if (clothes[i] >= 0) {
                answer++;
            }
        }
        
        return answer;
    }
}