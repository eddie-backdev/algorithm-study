class Solution {
    public int solution(String s) {
        int answer = 0;
        char firstChar = s.charAt(0);
        int sameCount = 0;
        int diffCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == firstChar) {
                sameCount++;
            } else {
                diffCount++;
            }

            if (sameCount == diffCount) {
                answer++;
                sameCount = 0;
                diffCount = 0;

                if (i < s.length() - 1) {
                    firstChar = s.charAt(i + 1);
                }
            }
        }

        if (sameCount != 0 || diffCount != 0) {
            answer++;
        }

        return answer;
    }
}