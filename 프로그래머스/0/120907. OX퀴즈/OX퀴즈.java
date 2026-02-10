import java.util.*;

class Solution {
    public String[] solution(String[] quiz) {
        List<String> answer = new ArrayList<>();
        
        for (String s : quiz) {
            String[] qArr = s.split(" ");
            int a = Integer.parseInt(qArr[0]);
            int b = Integer.parseInt(qArr[2]);
            int result = Integer.parseInt(qArr[4]);
            
            if (qArr[1].equals("+")) {
                if (a + b == result) {
                    answer.add("O");
                } else {
                    answer.add("X");
                }
            } else {
                if (a - b == result) {
                    answer.add("O");
                } else {
                    answer.add("X");
                }
            }
        }
        
        return answer.stream().toArray(String[]::new);
    }
}