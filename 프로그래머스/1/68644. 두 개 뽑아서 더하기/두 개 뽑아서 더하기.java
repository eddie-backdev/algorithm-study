import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();
        
        for (int i = 1; i <= numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                int temp = numbers[i-1] + numbers[j];
                set.add(temp);
            }
        }
        int[] answer = set.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(answer);
        return answer;
    }
}