class Solution {
    public int solution(int[] diffs, int[] times, long limit) {
        int low = 1;
        int high = 0;
        for (int num : diffs) high = Math.max(high, num);
        
        int answer = high;
        
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if (checker(diffs, times, limit, mid)) {
                answer = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return answer;
    }
    
    boolean checker(int[] diffs, int[] times, long limit, int level) {
        long total = 0;
        int length = diffs.length;
        
        for (int i = 0; i < length; i++) {
            long timeCur = times[i];
            long timePrev = (i == 0) ? 0 : times[i - 1];
            
            int miss = Math.max(0, diffs[i] - level);
            total += (long) miss * (timePrev + timeCur) + timeCur;
            
            if (total > limit) return false;
        }
        return total <= limit;
    }
}