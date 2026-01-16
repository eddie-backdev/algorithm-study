import java.util.*;

class Solution {
    public int solution(int[] order) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        int orderIdx = 0;
        
        for (int box = 1; box <= order.length; box++) {
            stack.push(box);
            
            while (!stack.isEmpty() && stack.peek() == order[orderIdx]) {
                stack.pop();
                answer++;
                orderIdx++;
            }
        }
        
        return answer;
    }
}