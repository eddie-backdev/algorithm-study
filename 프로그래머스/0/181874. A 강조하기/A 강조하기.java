class Solution {
    public String solution(String myString) {
        StringBuilder answer = new StringBuilder();
        
        for (char c : myString.toCharArray()) {
            if (c == 'a' || c == 'A') {
                answer.append('A');
            } else {
                answer.append(Character.toLowerCase(c));
            }
        }
        
        return answer.toString();
    }
}