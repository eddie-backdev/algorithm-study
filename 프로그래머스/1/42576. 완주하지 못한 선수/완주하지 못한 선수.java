import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();

        for (String p : participant) {
            map.merge(p, 1, Integer::sum);
        }
        
        for (String c : completion) {
            map.computeIfPresent(c, (key, value) -> value - 1);
        }
        
        return map.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse("");
    }
}