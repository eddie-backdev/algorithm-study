import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (answer.isEmpty()) {
                answer.add(arr[i]);
                continue;
            }
            
            int lastIdx = answer.size() - 1;
            
            if (answer.get(lastIdx) == arr[i]) {
                answer.remove(lastIdx);
            } else {
                answer.add(arr[i]);
            }
        }
        
        return answer.isEmpty() ? new int[]{-1} : answer.stream().mapToInt(Integer::intValue).toArray();
    }
}