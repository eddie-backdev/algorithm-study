import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        
        Map<String, Integer> wantMap = new HashMap<>();
        
        for (int i = 0; i < number.length; i++) {
            wantMap.put(want[i], number[i]);
        }
        
        for (int i = 0; i <= discount.length - 10; i++) {
            Map<String, Integer> discountMap = new HashMap<>();
            for (int j = i; j < i + 10; j++) {
                discountMap.put(discount[j], discountMap.getOrDefault(discount[j], 0) + 1);
            }
            
            boolean ok = true;
            
            for (Map.Entry<String, Integer> wm : wantMap.entrySet()) {
                if (discountMap.getOrDefault(wm.getKey(), 0) != wm.getValue()) {
                    ok = false;
                    break;
                }
            }
            
            if (ok) answer++;
        }
        
        return answer;
    }
}