import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> arrList = new ArrayList<>();
        
        for (int a : arr) {
            arrList.add(a);
        }
        
        for (Integer d : delete_list) {
            arrList.remove(d);
        }
        
        int[] answer = arrList.stream().mapToInt(i -> i).toArray();
        
        return answer;
    }
}