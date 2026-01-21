import java.util.*;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        Queue<String> dq = new ArrayDeque<>();
        
        String[] skills = skill.split("");
        
        for (String s : skill_trees) {
            String[] sArr = s.split("");
            
            dq.clear();
            
            for (String s2 : skills) {
                dq.add(s2);
            }
            
            for (int i = 0; i < sArr.length; i++) {
                if (dq.contains(sArr[i])) {
                    if (dq.peek().equals(sArr[i])) {
                        dq.poll();
                    } else {
                        break;
                    }
                }
                
                if (i == sArr.length - 1) {
                    answer++;
                }
            }
        }
        return answer;
    }
}