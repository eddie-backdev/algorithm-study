import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        return Arrays.stream(numlist)
                .boxed()
                .sorted((a, b) -> {
                    int absA = Math.abs(a - n);
                    int absB = Math.abs(b - n);
                    
                    if (absA == absB) {
                        return b - a;
                    }
                    
                    return absA - absB;
                })
                .mapToInt(Integer::intValue)
                .toArray();
    }
}