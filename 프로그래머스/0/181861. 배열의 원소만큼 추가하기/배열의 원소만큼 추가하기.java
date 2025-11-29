import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> arrList = new ArrayList<>();
        
        for (int a : arr) {
            for (int i = 0; i < a; i++) {
                arrList.add(a);
            }
        }
        int[] answer = arrList.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}