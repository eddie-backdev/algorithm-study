class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        int[] cnt = new int[26];
        
        for (int i = 0; i < s.length(); i++) {
            cnt[s.charAt(i) - 'a']++;
        }
        
        
        for (int i = 0; i < 26; i++) {
            if (cnt[i] == 1) {
                answer.append((char) (i + 'a'));
            }
        }
        
        return answer.toString();
    }
}