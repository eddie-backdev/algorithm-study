import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        List<Integer> answer = new ArrayList<>();
        
        int[] first = {1, 2, 3, 4, 5};
        int[] second = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] scores = new int[3];
        
        for (int i = 0; i < answers.length; i++) {
            if (first[i % 5] == answers[i]) {
                scores[0]++;
            }
            
            if (second[i % 8] == answers[i]) {
                scores[1]++;
            }
            
            if (third[i % 10] == answers[i]) {
                scores[2]++;
            }
        }
        
        int winner = Math.max(scores[0], Math.max(scores[1], scores[2]));
        
        for (int i = 0; i < 3; i++) {
            if (scores[i] == winner) {
                answer.add(i + 1);
            }
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}