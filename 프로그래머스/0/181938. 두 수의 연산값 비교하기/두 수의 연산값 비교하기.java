class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String ans = Integer.toString(a)+Integer.toString(b);
        int ab = Integer.parseInt(ans);
        
        if(ab>2*a*b || ab==2*a*b) answer = ab;
        else answer = 2*a*b;
        
        return answer;
    }
}