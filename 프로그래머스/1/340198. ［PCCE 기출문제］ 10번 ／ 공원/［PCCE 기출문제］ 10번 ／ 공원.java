import java.util.Arrays;

class Solution {
    public int solution(int[] mats, String[][] park) {
        Arrays.sort(mats);

        for (int i = mats.length - 1; i > -1; i--) {
            int n = mats[i];
            
            for (int j = 0; j + n <= park.length; j++) {
                for (int k = 0; k + n <= park[0].length; k++) {
                    if (isEmpty(park, j, k, n)) {
                        return n;
                    }
                }
            }
        }
        return -1;
    }
    
    boolean isEmpty(String[][] park, int x, int y, int n) {
        for (int i = x; i < x + n; i++) {
            for (int j = y; j < y + n; j++) {
                if(!park[i][j].equals("-1")) {
                    return false;
                }
            }
        }
        return true;
    }
}