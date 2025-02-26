import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(arr[0]);
        
        for (int i = 1; i < arr.length; i++) {
            if (stack.peek() != arr[i]) {
                stack.push(arr[i]);
            }
        }
        
        int idx = stack.size()-1;
        int[] answer = new int[stack.size()];
        
        for (Integer i : stack) {
            answer[idx--] = i;
        }
        return answer;
    }
}