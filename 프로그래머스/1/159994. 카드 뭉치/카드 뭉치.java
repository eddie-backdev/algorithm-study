class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {        
        int oneIndex = 0;
        int twoIndex = 0;
        
        for (String g : goal) {
            if (oneIndex < cards1.length && g.equals(cards1[oneIndex])) {
                oneIndex++;
            } else if (twoIndex < cards2.length && g.equals(cards2[twoIndex])) {
                twoIndex++;
            } else {
                return "No";
            }
        }
        
        return "Yes";
    }
}