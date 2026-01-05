class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String[] sArr = my_string.split("[^0-9]");
        
        for (String s : sArr) {
            if (!s.isEmpty()) {
                answer += Integer.parseInt(s);
            }
        }
        
        return answer;
    }
}