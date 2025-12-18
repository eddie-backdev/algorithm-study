class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        for (int n : num_list) {
            answer += (31 - Integer.numberOfLeadingZeros(n));
        }
        return answer;
    }
}