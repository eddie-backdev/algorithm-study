import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        
        if (cacheSize == 0) {
            return cities.length * 5;
        }
        
        List<String> cl = new ArrayList<>();
            
        for (int i = 0; i < cities.length; i++) {
            String s = cities[i].toUpperCase();
            
            if (cl.contains(s)) {
                answer += 1;
                cl.remove(s);
                cl.add(s);
            } else {
                answer += 5;
                if (cl.size() >= cacheSize) {
                    cl.remove(0);
                }
                cl.add(s);
            }
        }
        return answer;
    }
}