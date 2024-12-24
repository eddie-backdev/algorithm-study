class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int total = brown + yellow;
        
        for (int i = 3; i <= total / i; i++) {
            if (total % i == 0) {
                int width = total / i;
                int yWidth = width - 2;
                int yHeight = i - 2;
                
                if (yWidth * yHeight == yellow) {
                    answer[0] = width;
                    answer[1] = i;
                }
            }
            
        }
        return answer;
    }
}