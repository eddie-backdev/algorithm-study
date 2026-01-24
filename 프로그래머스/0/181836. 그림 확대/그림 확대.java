class Solution {
    public String[] solution(String[] picture, int k) {
        int rows = picture.length;
        int cols = picture[0].length();
        String[] answer = new String[rows * k];

        for (int i = 0; i < rows; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < cols; j++) {
                char c = picture[i].charAt(j);
                for (int repeat = 0; repeat < k; repeat++) {
                    sb.append(c);
                }
            }
            String expandedRow = sb.toString();

            for (int repeat = 0; repeat < k; repeat++) {
                answer[i * k + repeat] = expandedRow;
            }
        }
        return answer;
    }
}