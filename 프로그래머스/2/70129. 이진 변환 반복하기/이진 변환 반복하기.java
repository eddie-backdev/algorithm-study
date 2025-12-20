class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        while (!s.equals("1")) {
            int beforeLength = s.length();
            s = s.replaceAll("0", "");
            int afterLength = s.length();
            s = Integer.toBinaryString(afterLength);
            answer[0]++;
            answer[1] += beforeLength - afterLength;
        }
        
        return answer;
    }
}