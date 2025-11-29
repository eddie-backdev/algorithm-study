import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        List<String> ansList = new ArrayList<>();
        
        for (String s : strArr) {
            if (!s.contains("ad")) {
                ansList.add(s);
            }
        }
        
        String[] answer = ansList.toArray(String[]::new);
        
        return answer;
    }
}