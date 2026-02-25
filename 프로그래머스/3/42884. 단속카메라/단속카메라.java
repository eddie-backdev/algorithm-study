import java.util.*;

class Solution {
    public int solution(int[][] routes) {
        int answer = 0;
        
        int camera = Integer.MIN_VALUE;
        
        Arrays.sort(routes, (a, b) -> Integer.compare(a[1], b[1]));
        
        for (int[] route : routes) {
            if (route[0] > camera) {
                camera = route[1];
                answer++;
            }
        }
        
        return answer;
    }
}