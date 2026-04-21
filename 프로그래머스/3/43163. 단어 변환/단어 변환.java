import java.util.*;

class Solution {
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        boolean isOk = false;

        for(String word : words) {        
            if (word.equals(target)) {
                isOk = true;
                break;
            }
        }
        
        if (!isOk) {
            return answer;
        }
        
        Queue<String> dq = new ArrayDeque<>();
        boolean[] visited = new boolean[words.length];
        dq.offer(begin);
        while (!dq.isEmpty()) {
            int size = dq.size();
            
            for (int i = 0; i < size; i++) {
                String cWord = dq.poll();
                
                if (cWord.equals(target)) {
                    return answer;
                }
                
                for (int j = 0; j < words.length; j++) {
                    if (!visited[j] && checker(cWord, words[j])) {
                        visited[j] = true;
                        dq.offer(words[j]);
                    }
                }
            }
            answer++;
        }
        
        return 0;
    }
    
    boolean checker(String s1, String s2) {
        int count = 0;
        
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                count++;
            }
            if (count > 1) {
                return false;
            }
        }
        
        return count == 1;
    }
}