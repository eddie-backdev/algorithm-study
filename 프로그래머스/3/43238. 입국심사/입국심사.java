import java.util.*;

class Solution {
    public long solution(int n, int[] times) {
        long answer = 0;
        
        Arrays.sort(times);
        
        long lo = 0;
        long hi = (long) times[times.length - 1] * (long) n;
        
        while (lo <= hi) {
            long mid = (lo + hi) / 2;
            long done = 0;
            
            for (int i : times) {
                done += mid / i;
            }
            
            if (done < n) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
                answer = mid;
            }
        }
        
        return answer;
    }
}