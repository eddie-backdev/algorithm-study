import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public String solution(int[] numbers) {
        String answer = Arrays.stream(numbers)
                .mapToObj(String::valueOf)
                .sorted((a, b) -> (b + a).compareTo(a + b))
                .collect(Collectors.joining());
        
        return answer.startsWith("0") ? "0" : answer;
    }
}