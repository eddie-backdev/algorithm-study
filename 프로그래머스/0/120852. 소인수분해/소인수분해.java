import java.util.Set;
import java.util.LinkedHashSet;

class Solution {
    public int[] solution(int n) {
        Set<Integer> set = new LinkedHashSet<>();
        
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                set.add(i);
                n /= i;
            }
        }
        return set.stream()
            .mapToInt(Integer::intValue)
            .toArray();
    }
}