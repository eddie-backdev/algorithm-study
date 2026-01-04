import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[] strArr) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (String str : strArr) {
            int length = str.length();
            map.put(length, map.getOrDefault(length, 0) + 1);
        }
        
        int max = 0;
        for (int count : map.values()) {
            if (count > max) {
                max = count;
            }
        }
        
        return max;
    }
}