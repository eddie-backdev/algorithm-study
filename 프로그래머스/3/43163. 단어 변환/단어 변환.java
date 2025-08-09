import java.util.*;

class Solution {
    public int solution(String begin, String target, String[] words) {
        boolean[] visited = new boolean[words.length];
        Queue<Word> q = new LinkedList<>();
        q.offer(new Word(begin, 0));
        while (!q.isEmpty()) {
            Word current = q.poll();
            
            if (current.word.equals(target)) {
                return current.count;
            }
            
            for (int i = 0; i < words.length; i++) {
                if (!visited[i] && checkWord(current.word, words[i])) {
                    visited[i] = true;
                    q.offer(new Word(words[i], current.count + 1));
                }
            }
        }
        return 0;
    }
    
    public boolean checkWord(String current, String next) {
        int diff = 0;
        for (int i = 0; i < current.length(); i++) {
            if (current.charAt(i) != next.charAt(i)) {
                diff++;
            }
            if (diff > 1) return false;
        }
        return diff == 1;
    }
    
    static class Word {
        String word;
        int count;
        
        Word(String word, int count) {
            this.word = word;
            this.count = count;
        }
    }
}