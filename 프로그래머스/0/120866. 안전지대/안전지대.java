import java.util.*;

class Solution {
    
    static int[] dx = {-1,0,1,1,1,0,-1,-1};
    static int[] dy = {-1,-1,-1,0,1,1,1,0};
    
    public int solution(int[][] board) {
        int answer = 0;
        
        List<int[]> mine = new ArrayList<>();
        findMine(board, mine);
        findSafeZone(board, mine);
        
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                if(board[i][j] == 0){
                    answer++;
                }
            }
        }
        
        return answer;
    }
    
    void findMine(int[][] board, List<int[]> mine) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 1) {
                    int[] mineTemp = {i, j};
                    mine.add(mineTemp);
                }
            }
        }
    }
    
    void findSafeZone(int[][] board, List<int[]> mine) {
        int length = board.length;
        for (int i = 0; i < mine.size(); i++) {
            int x = mine.get(i)[0];
            int y = mine.get(i)[1];
            for (int j = 0; j < 8; j++) {
                if (dx[j] + x > -1 && dy[j] + y > -1 && dx[j] + x < length && dy[j] + y < length) {
                    board[dx[j] + x][dy[j] + y] = 1;
                }
            }
        }
    }
}