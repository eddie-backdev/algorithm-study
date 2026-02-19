import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Deque<Integer> stack = new ArrayDeque<>();
        
        for (int i : arr) {
            if (stack.isEmpty() || stack.peekLast() != i) {
                stack.add(i);
            }
        }

        return stack.stream().mapToInt(i -> i).toArray();
    }
}