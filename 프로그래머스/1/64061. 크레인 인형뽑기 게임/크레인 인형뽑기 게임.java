import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
        Stack<Integer> basket = new Stack<>();
        int answer = 0;
        
        for (int move : moves) {
            for (int j = 0; j < board.length; j++) {
                int doll = board[j][move - 1];
                if (doll != 0) {
                    board[j][move - 1] = 0;
                    if (!basket.isEmpty() && basket.peek() == doll) {
                        basket.pop();
                        answer += 2;
                    } else {
                        basket.push(doll);
                    }
                    break;
                }
            }
        }
        return answer;
    }
}