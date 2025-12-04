class Solution {
    public int solution(int n, int w, int num) {
        int answer = 0;
        
        int targetRow = (num - 1) / w;
        int targetCol;
        
        if (targetRow % 2 == 0) {
            targetCol = (num - 1) % w;
        } else {
            targetCol = (w - 1) - ((num - 1) % w);
        }

        for (int r = targetRow; ; r++) {
            int boxNumInCurrentRow;
            
            if (r % 2 == 0) {
                boxNumInCurrentRow = (r * w) + targetCol + 1;
            } else {
                boxNumInCurrentRow = (r * w) + (w - 1 - targetCol) + 1;
            }

            if (boxNumInCurrentRow > n) {
                break;
            }
            
            answer++;
        }
        
        return answer;
    }
}