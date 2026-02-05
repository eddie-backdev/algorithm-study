import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        List<Integer> scoreList = new ArrayList<>();
        
        for (int[] s : score) {
            scoreList.add(s[0] + s[1]);
        }

        List<Integer> sortedList = new ArrayList<>(scoreList);
        sortedList.sort(Comparator.reverseOrder());

        for (int i = 0; i < score.length; i++) {
            answer[i] = sortedList.indexOf(scoreList.get(i)) + 1;
        }

        return answer;
    }
}