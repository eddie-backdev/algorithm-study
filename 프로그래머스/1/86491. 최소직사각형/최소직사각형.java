class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        for (int i = 0; i < sizes.length; i++) {
            if(sizes[i][0] < sizes[i][1]) {
                int temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
        }
        int maxWidth = sizes[0][0];
        int maxLength = sizes[0][1];
        
        for (int i = 1; i < sizes.length; i++) {
            if (maxWidth < sizes[i][0] ) {
                maxWidth = sizes[i][0];
            }
        }
        for (int i = 1; i < sizes.length; i++) {
            if (maxLength < sizes[i][1] ) {
                maxLength = sizes[i][1];
            }
        }
        return maxWidth * maxLength;
    }
}