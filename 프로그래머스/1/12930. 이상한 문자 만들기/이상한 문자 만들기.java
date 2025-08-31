class Solution {
    public String solution(String s) {
        String answer = "";
        
        s = s.toLowerCase();
        
        String[] sArr = s.split("");
        
        int key = 0;
        
        for(int i = 0; i < sArr.length; i++) {
            if(key % 2 == 0) {
                sArr[i] = sArr[i].toUpperCase();
            }

            if(sArr[i].isBlank()) {
                key = -1;
            }
            answer += sArr[i];
            key++;
        }
        
        return answer;
    }
}