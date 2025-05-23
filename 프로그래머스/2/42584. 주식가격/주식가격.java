import java.util.Stack;

class Solution {
    public int[] solution(int[] prices) {
        Stack<Integer> stack = new Stack<>();
        int length = prices.length;
        int[] answer = new int[length];
        
        for (int i = 0; i < length; i++) {
            while(!stack.isEmpty() && prices[stack.peek()] > prices[i]) {
                int idx = stack.pop();
                answer[idx] = i - idx;
            }
            stack.push(i);
        }
        while(!stack.isEmpty()) {
            int idx = stack.pop();
            answer[idx] = length - idx - 1;
        }
        
        return answer;
    }
}