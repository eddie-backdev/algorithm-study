import java.util.Stack;

class Solution {
    public int solution(String s) {
        int n = s.length();
        int answer = 0;

        for (int i = 0; i < n; i++) {
            String rotated = s.substring(i) + s.substring(0, i);

            Stack<Character> stack = new Stack<>();
            boolean valid = true;

            for (char c : rotated.toCharArray()) {
                if (c == '(' || c == '[' || c == '{') {
                    stack.push(c);
                } else {
                    if (stack.isEmpty()) {
                        valid = false;
                        break;
                    }
                    char top = stack.pop();

                    if (c == ')' && top != '(') {
                        valid = false; break;
                    }
                    if (c == ']' && top != '[') {
                        valid = false; break;
                    }
                    if (c == '}' && top != '{') {
                        valid = false; break;
                    }
                }
            }

            if (valid && stack.isEmpty()) {
                answer++;
            }
        }

        return answer;
    }
}
