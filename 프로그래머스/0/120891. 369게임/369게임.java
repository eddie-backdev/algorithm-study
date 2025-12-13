class Solution {
    public int solution(int order) {
        int answer = 0;
        String s = Integer.toString(order);
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '3' || s.charAt(i) == '6' || s.charAt(i) == '9') {
                answer++;
            }
        }
        
        return answer;
    }
}