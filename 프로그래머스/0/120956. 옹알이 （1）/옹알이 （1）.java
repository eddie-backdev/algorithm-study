class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] sArr = {"aya", "ye", "woo", "ma"};
        
        for(String word : babbling){
            for(String s : sArr){
                if(word.contains(s)){
                    word = word.replace(s, " ");
                }
            }
            if(word.isBlank()) {
                answer++;
            }
        }
        
        return answer;
    }
}