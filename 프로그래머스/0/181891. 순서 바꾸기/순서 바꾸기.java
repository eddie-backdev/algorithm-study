import java.util.ArrayList;

class Solution {
    public int[] solution(int[] num_list, int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = n; i < num_list.length; i++) {
            ans.add(num_list[i]);
        }
        for (int i = 0; i < n; i++) {
            ans.add(num_list[i]);
        }
        return ans.stream()
            .mapToInt(Integer::intValue)
            .toArray();
    }
}