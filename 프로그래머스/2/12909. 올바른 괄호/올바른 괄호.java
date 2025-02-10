import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    boolean solution(String s) {
        int cnt = 0;
        if (s.startsWith(")")) return false;
        
        Deque<Character> queue = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            queue.offer(s.charAt(i));
        }

        while (!queue.isEmpty()) {
            if (cnt < 0) return false;
            if (queue.poll().equals('(')) {
                cnt++;
            }
            else {
                cnt--;
            }
        }
        
        if (cnt == 0) {
            return true;
        } else return false;
    }
}