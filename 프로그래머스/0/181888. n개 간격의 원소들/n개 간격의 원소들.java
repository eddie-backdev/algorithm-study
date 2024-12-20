class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer;
        if (num_list.length % n == 0) {
            answer = new int[(num_list.length / n)];
            for (int i = 0; i < num_list.length / n; i++) {
                answer[i] = num_list[i * n];
            }
        } else {
            answer = new int[(num_list.length / n)+1];
            for (int i = 0; i <= num_list.length / n; i++) {
                answer[i] = num_list[i * n];
            }
        }

        return answer;
    }
}