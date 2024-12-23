import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {
        int[] first = {1,2,3,4,5};
        int[] second = {2,1,2,3,2,4,2,5};
        int[] third = {3,3,1,1,2,2,4,4,5,5};
        
        int[] answer = new int[3];
        ArrayList<Integer> ans = new ArrayList<>();
        
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == first[i % first.length]) answer[0]++;
            if (answers[i] == second[i % second.length]) answer[1]++;
            if (answers[i] == third[i % third.length]) answer[2]++;
        }
        
        int maxScore = Math.max(answer[0], Math.max(answer[1], answer[2]));
        
        for (int i = 0; i < 3; i++) {
            if (maxScore == answer[i]) {
                ans.add(i+1);
            }
        }
        
        
        return ans.stream()
            .mapToInt(i -> i)
            .toArray();
    }
}